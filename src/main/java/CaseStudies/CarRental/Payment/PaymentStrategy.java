package CaseStudies.CarRental.Payment;

import CaseStudies.CarRental.Bill.Bill;

public interface PaymentStrategy {
    Payment makePayment(Bill bill, double amount);
}
