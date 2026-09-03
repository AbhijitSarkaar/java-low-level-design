package SolidPrinciples.SingleResponsibility;

public class InvoicePrint {
    private Invoice invoice;

    InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("InvoicePrint.print()");
        System.out.println("Invoice Total: " + this.invoice.getTotalAmount());
    }
}
