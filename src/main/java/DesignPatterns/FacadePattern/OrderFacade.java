package DesignPatterns.FacadePattern;

public class OrderFacade {
    private InvoiceDao invoiceDao;
    private OrderDao orderDao;
    private PaymentDao paymentDao;
    private ProductDao productDao;

    public OrderFacade() {
        this.invoiceDao = new InvoiceDao();
        this.orderDao = new OrderDao();
        this.paymentDao = new PaymentDao();
        this.productDao = new ProductDao();
    }

    public void createOrder() {
        productDao.createProduct();
        orderDao.createOrder();;
        paymentDao.makePayment();
        invoiceDao.generateInvoice();;
    }

}
