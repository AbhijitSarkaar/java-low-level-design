package CaseStudies.CarRental.Payment;

import java.util.UUID;

public class Payment {

    UUID paymentId;
    UUID billId;
    double amountPaid;
    PaymentMode paymentMode;

    public Payment(UUID billId, double amountPaid, PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID();
        this.billId = billId;
        this.amountPaid = amountPaid;
        this.paymentMode = paymentMode;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

}
