package CaseStudies.CarRental.Bill;

import CaseStudies.CarRental.Product.Vehicle;
import CaseStudies.CarRental.Reservation.Reservation;
import CaseStudies.CarRental.Product.VehicleInventoryManager;

import java.time.temporal.ChronoUnit;

public class DailyBillingStrategy implements BillingStrategy {

    VehicleInventoryManager vehicleInventoryManager;

    public DailyBillingStrategy(VehicleInventoryManager vehicleInventoryManager) {
        this.vehicleInventoryManager = vehicleInventoryManager;
    }

    @Override
    public Bill generateBill(Reservation r) {

        long days = ChronoUnit.DAYS.between(
                r.getBookedFrom(), r.getBookedTo()
        );

        Vehicle vehicle = vehicleInventoryManager.getVehicle(r.getVehicleId());
        double total = days * vehicle.getDailyRentCost();

        return new Bill(
                r.getReservationId(),
                total
        );

    }
}
