package SolidPrinciples.OpenClose;

public class Main {
    public static void main(String[] args) {
        InvoiceDao dbInvoice = new DBInvoiceDao();
        InvoiceDao fileInvoice = new FileInvoiceDao();

        dbInvoice.save();
        fileInvoice.save();
    }
}
