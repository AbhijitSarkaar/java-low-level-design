package CaseStudies.CarRental.Bill;

import java.util.UUID;

public class Bill {

    UUID billId;
    UUID reservationId;
    double totalAmount;
    boolean isBillPaid;

    public Bill(UUID reservationId, double totalAmount) {
        this.billId = UUID.randomUUID();
        this.reservationId = reservationId;
        this.totalAmount = totalAmount;
    }

    public UUID getBillId() {
        return billId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setBillPaid(boolean billPaid) {
        isBillPaid = billPaid;
    }

}
