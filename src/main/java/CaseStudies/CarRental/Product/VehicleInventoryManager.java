package CaseStudies.CarRental.Product;

import CaseStudies.CarRental.Enum.VehicleStatus;
import CaseStudies.CarRental.Reservation.Reservation;
import CaseStudies.CarRental.Reservation.ReservationRepository;
import CaseStudies.ParkingLot.Enums.VehicleType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class VehicleInventoryManager {

    private final ConcurrentMap<UUID, Vehicle> vehicles = new ConcurrentHashMap<>();

    private final ConcurrentMap<UUID, List<UUID>> vehicleBookingIds = new ConcurrentHashMap<>();

    private final ConcurrentMap<UUID, ReentrantLock> vehicleLocks = new ConcurrentHashMap<>();

    ReservationRepository reservationRepository;

    public void addVehicle(Vehicle v) {
        vehicles.put(v.getVehicleId(), v);
    }

    public Vehicle getVehicle(UUID vehicleId) {
        return vehicles.get(vehicleId);
    }

    public ReentrantLock lockForVehicle(UUID vehicleId) {
        vehicleLocks.putIfAbsent(vehicleId, new ReentrantLock());
        return vehicleLocks.get(vehicleId);
    }

    public boolean isAvailable(UUID vehicleId, LocalDate bookedFrom, LocalDate bookedTo) {
        Vehicle vehicle = vehicles.get(vehicleId);

        if(vehicle == null) return false;
        if(vehicle.getVehicleStatus() == VehicleStatus.MAINTENANCE) return false;

        DateInterval requested = new DateInterval(bookedFrom, bookedTo);

        List<UUID> reservationIds = vehicleBookingIds.get(vehicleId);
        if(reservationIds == null || reservationIds.isEmpty()) {
            return true;
        }
        for(UUID reservationId: reservationIds) {
            Reservation reservation = reservationRepository.findById(reservationId);
            LocalDate from = reservation.getBookedFrom();
            LocalDate to = reservation.getBookedTo();
            DateInterval bookedInterval = new DateInterval(from, to);
            if(bookedInterval.overlaps(requested)) {
                return false;
            }
        }
        return true;
    }

    public boolean reserve(UUID vehicleId, UUID reservationId, LocalDate from, LocalDate to) {
        ReentrantLock lock = lockForVehicle(vehicleId);
        lock.lock();
        try {
            if(!isAvailable(vehicleId, from, to)) {
                return false;
            }

            vehicleBookingIds.putIfAbsent(vehicleId, new ArrayList<>());
            vehicleBookingIds.get(vehicleId).add(reservationId);
            vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.BOOKED);

            return true;
        } finally {
            lock.unlock();
        }
    }

    public void releaseVehicle(UUID vehicleId, UUID reservationId) {

        ReentrantLock lock = vehicleLocks.get(vehicleId);
        lock.lock();

        try {

            // remove reservation
            List<UUID> ids = vehicleBookingIds.get(vehicleId);
            if(ids != null) {
                ids.remove(reservationId);
            }

            // set status to available if no more existing reservations for the vehicle
            List<UUID> stillBooked = vehicleBookingIds.get(vehicleId);
            if(stillBooked == null || stillBooked.isEmpty()) {
                vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.AVAILABLE);
            }

        } finally {
            lock.unlock();
        }
    }

    public List<Vehicle> getAvailableVehicles(
            VehicleType type,
            LocalDate from,
            LocalDate to
    ) {
        return vehicles.values()
                .stream()
                .filter(vehicle -> vehicle.getVehicleType() == type)
                .filter(vehicle -> isAvailable(vehicle.getVehicleId(), from, to))
                .collect(Collectors.toList());
    }

}
