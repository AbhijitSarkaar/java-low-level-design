package CaseStudies.CarRental.Payment;

import CaseStudies.CarRental.Bill.Bill;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public Payment makePayment(Bill bill, double amount) {
        Payment payment = new Payment(bill.getBillId(), amount, PaymentMode.UPI);
        bill.setBillPaid(true);
        return payment;
    }
}
