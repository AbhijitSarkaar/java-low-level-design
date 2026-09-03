package SolidPrinciples.OpenClose;

public class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save() {
        System.out.println("FileInvoiceDao.save()");
    }
}
