package SolidPrinciples.SingleResponsibility;

public class Invoice {

    private Integer totalAmount;

    public void calculateTotal() {
        System.out.println("Invoice.calculateTotal()");
        this.totalAmount = 0;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }
}
