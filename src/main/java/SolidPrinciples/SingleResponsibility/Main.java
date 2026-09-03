package SolidPrinciples.SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.calculateTotal();

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrint invoicePrint = new InvoicePrint(invoice);

        invoiceDao.saveToDB();
        invoicePrint.print();
    }
}
