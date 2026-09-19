package CaseStudies.Book_My_Show.Entities;

import CaseStudies.Book_My_Show.Enums.PaymentStatus;

import java.util.UUID;

public class Payment {
    UUID paymentId;
    PaymentStatus paymentStatus;

    public Payment(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        this.paymentId = UUID.randomUUID();
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
