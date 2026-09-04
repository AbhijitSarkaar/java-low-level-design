package CaseStudies.ParkingLot.Payment;

public class CashPayment implements Payment {
    @Override
    public boolean makePayment(double amount) {
        System.out.println("CashPayment.makePayment()");
        return true;
    }
}
