package CaseStudies.CarRental.Payment;

import CaseStudies.CarRental.Bill.Bill;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PaymentManager {

    ConcurrentMap<UUID, Payment> payments;

    public PaymentManager() {
        this.payments = new ConcurrentHashMap<>();
    }

    public Payment makePayment(Bill bill, double amount, PaymentStrategy paymentStrategy) {
        Payment payment = paymentStrategy.makePayment(bill, amount);
        payments.put(payment.getPaymentId(), payment);
        return payment;
    }
}
