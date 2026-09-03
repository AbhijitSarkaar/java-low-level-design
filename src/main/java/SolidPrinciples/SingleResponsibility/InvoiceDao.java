package SolidPrinciples.SingleResponsibility;

public class InvoiceDao {
    private Invoice invoice;

    InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("InvoiceDao.saveToDB()");
        System.out.println("Invoice Total: " + this.invoice.getTotalAmount());
    }
}
