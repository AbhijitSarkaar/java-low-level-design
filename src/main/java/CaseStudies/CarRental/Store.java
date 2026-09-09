package CaseStudies.CarRental;

import CaseStudies.CarRental.Bill.Bill;
import CaseStudies.CarRental.Bill.BillManager;
import CaseStudies.CarRental.Bill.BillingStrategy;
import CaseStudies.CarRental.Enum.ReservationType;
import CaseStudies.CarRental.Payment.Payment;
import CaseStudies.CarRental.Payment.PaymentManager;
import CaseStudies.CarRental.Payment.PaymentStrategy;
import CaseStudies.CarRental.Product.Vehicle;
import CaseStudies.CarRental.Product.VehicleInventoryManager;
import CaseStudies.CarRental.Reservation.Reservation;
import CaseStudies.CarRental.Reservation.ReservationManager;
import CaseStudies.ParkingLot.Enums.VehicleType;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Store {

    UUID storeId;
    Location location;
    public ReservationManager reservationManager;
    public VehicleInventoryManager vehicleInventoryManager;
    public BillManager billManager;
    public PaymentManager paymentManager;

    public Store(Location location, ReservationManager reservationManager, VehicleInventoryManager vehicleInventoryManager, PaymentManager paymentManager, BillManager billManager) {
        this.storeId = UUID.randomUUID();
        this.location = location;
        this.vehicleInventoryManager = vehicleInventoryManager;
        this.reservationManager = reservationManager;
        this.paymentManager = paymentManager;
        this.billManager = billManager;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType, LocalDate from, LocalDate to) {
        return vehicleInventoryManager.getAvailableVehicles(vehicleType, from, to);
    }

    public VehicleInventoryManager getInventory() {
        return vehicleInventoryManager;
    }

    public Reservation createReservation(UUID vehicleId, UUID userId, LocalDate bookedFrom, LocalDate bookedTo, ReservationType reservationType) {
        return this.reservationManager.createReservation(vehicleId, userId, bookedFrom, bookedTo, reservationType);
    }

    public void startTrip(UUID reservationId) {
        this.reservationManager.startTrip(reservationId);
    }

    public void submitVehicle(UUID reservationId) {
        this.reservationManager.submitVehicle(reservationId);
    }

    public Bill generateBill(Reservation r, BillingStrategy billingStrategy) {
        return billManager.generateBill(r, billingStrategy);
    }

    public Payment makePayment(Bill bill, double totalAmount, PaymentStrategy paymentStrategy) {
        return paymentManager.makePayment(bill, totalAmount, paymentStrategy);
    }

}
