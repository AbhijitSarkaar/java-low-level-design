package CaseStudies.CarRental;

import CaseStudies.CarRental.Bill.Bill;
import CaseStudies.CarRental.Bill.BillManager;
import CaseStudies.CarRental.Bill.DailyBillingStrategy;
import CaseStudies.CarRental.Enum.ReservationType;
import CaseStudies.CarRental.Payment.Payment;
import CaseStudies.CarRental.Payment.PaymentManager;
import CaseStudies.CarRental.Payment.UPIPaymentStrategy;
import CaseStudies.CarRental.Product.Vehicle;
import CaseStudies.CarRental.Product.VehicleInventoryManager;
import CaseStudies.CarRental.Reservation.Reservation;
import CaseStudies.CarRental.Reservation.ReservationManager;
import CaseStudies.CarRental.Reservation.ReservationRepository;
import CaseStudies.ParkingLot.Enums.VehicleType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();

        ReservationRepository reservationRepository = new ReservationRepository();
        VehicleInventoryManager vehicleInventoryManager = new VehicleInventoryManager();
        ReservationManager reservationManager = new ReservationManager(vehicleInventoryManager, reservationRepository);
        PaymentManager paymentManager = new PaymentManager();
        BillManager billManager = new BillManager();

        // locations
        Location location1 = new Location("location1");

        // stores
        Store store1 = new Store(location1, reservationManager, vehicleInventoryManager, paymentManager, billManager);

        // users
        User user1 = new User("user1", "user1_dlNumber");

        // initialize rental system
        vehicleRentalSystem.addStores(store1);
//        vehicleRentalSystem.addStores(store2);
        vehicleRentalSystem.addUsers(user1);

        // vehicles
        Vehicle v1 = new Vehicle(VehicleType.FOUR_WHEELER, "vehicle1_number");
        v1.setDailyRentCost(1100);
        Vehicle v2 = new Vehicle(VehicleType.TWO_WHEELER, "vehicle2_number");
        v2.setDailyRentCost(1400);

        // add vehicles to inventory
        store1.getInventory().addVehicle(v1);
        store1.getInventory().addVehicle(v2);

        LocalDate fromDate = LocalDate.of(2025, 12, 5);
        LocalDate toDate = LocalDate.of(2025, 12, 10);

        System.out.println("Available vehicles from: " + fromDate + " to: " + toDate);

        for(Vehicle v: store1.getVehicles(VehicleType.FOUR_WHEELER, fromDate, toDate)) {
            System.out.println(v.getVehicleId() + " " + v.getVehicleType());
        }

        System.out.println("Create reservation");
        Reservation reservation1 = store1.createReservation(v1.getVehicleId(), user1.getUserId(), fromDate, toDate, ReservationType.DAILY);
        System.out.println("Reservation created with ID: " + reservation1.getReservationId());

        System.out.println("Starting trip");
        store1.startTrip(reservation1.getReservationId());

        System.out.println("Trip completed: Submitting vehicle");
        store1.submitVehicle(reservation1.getReservationId());

        System.out.println("Bill generation");
        Bill bill1 = store1.generateBill(reservation1, new DailyBillingStrategy(vehicleInventoryManager));
        System.out.println("Bill ID: " + bill1.getBillId());
        System.out.println("Bill amount: " + bill1.getTotalAmount());

        System.out.println("User makes payment");
        Payment payment = store1.makePayment(bill1, bill1.getTotalAmount(), new UPIPaymentStrategy());
        System.out.println("Payment ID " + payment.getPaymentId());
        System.out.println("Paid amount " + payment.getAmountPaid());
        System.out.println("Payment mode " + payment.getPaymentMode());

    }
}
