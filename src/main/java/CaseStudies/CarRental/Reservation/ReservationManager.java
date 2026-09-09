package CaseStudies.CarRental.Reservation;

import CaseStudies.CarRental.Enum.ReservationStatus;
import CaseStudies.CarRental.Enum.ReservationType;
import CaseStudies.CarRental.Product.VehicleInventoryManager;

import java.time.LocalDate;
import java.util.UUID;

public class ReservationManager {

    public VehicleInventoryManager vehicleInventoryManager;

    public ReservationRepository reservationRepository;

    public ReservationManager(VehicleInventoryManager vehicleInventoryManager, ReservationRepository reservationRepository) {
        this.vehicleInventoryManager = vehicleInventoryManager;
        this.reservationRepository = reservationRepository;
    }

    public Reservation createReservation(UUID vehicleId, UUID userId, LocalDate from, LocalDate to, ReservationType type) {
        UUID reservationId = UUID.randomUUID();
        boolean reserved = vehicleInventoryManager.reserve(vehicleId, reservationId, from, to);

        if(!reserved) {
            throw new RuntimeException("Vehicle not available for selected dates");
        }

        Reservation reservation = new Reservation(vehicleId, userId, from, to, type);

        reservationRepository.save(reservation);
        return reservation;
    }

    public Reservation findById(UUID reservationId) {
        return reservationRepository.findById(reservationId);
    }

    public void cancelReservation(UUID reservationId) {
        Reservation r = reservationRepository.findById(reservationId);
        if(r == null) {
            throw new RuntimeException("reservation not found");
        }
        r.setReservationStatus(ReservationStatus.CANCELLED);
        vehicleInventoryManager.releaseVehicle(r.getVehicleId(), r.getReservationId());
        reservationRepository.remove(r.getReservationId());
    }

    public void startTrip(UUID reservationId) {
        Reservation r = reservationRepository.findById(reservationId);
        r.setReservationStatus(ReservationStatus.IN_USE);
    }

    public void submitVehicle(UUID reservationId) {
        Reservation r = reservationRepository.findById(reservationId);
        r.setReservationStatus(ReservationStatus.COMPLETED);
        vehicleInventoryManager.releaseVehicle(r.getVehicleId(), r.getReservationId());
    }

    public void remove(UUID reservationId) {
        reservationRepository.remove(reservationId);
    }

}
