package SolidPrinciples.OpenClose;

public class DBInvoiceDao implements InvoiceDao {
    @Override
    public void save() {
        System.out.println("DBInvoiceDao.save()");
    }
}
