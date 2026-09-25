package CaseStudies.OrderManagementSystem;

import java.util.UUID;

public class Invoice {
    UUID invoiceId;
    double tax;
    double amount;

    public Invoice(double tax, double amount) {
        this.tax = tax;
        this.amount = amount;
        this.invoiceId = UUID.randomUUID();
    }

    public double getTotalAmount() {
        return amount + (amount * tax);
    }
}
