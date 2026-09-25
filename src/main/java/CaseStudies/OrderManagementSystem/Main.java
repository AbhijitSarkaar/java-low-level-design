package CaseStudies.OrderManagementSystem;

public class Main {
    public static void main(String[] args) {

        ProductController productController = new ProductController();
        Address address = new Address("location1");
        Product product1 = productController.createProduct("product1");
        Product product2 = productController.createProduct("product2");
        ProductCategory productCategory = new ProductCategory(1.0);
        ProductCategory productCategory2 = new ProductCategory(2.0);
        productCategory.addProduct(product1, productController);
        productCategory2.addProduct(product2, productController);

        Inventory inventory = new Inventory();
        inventory.addCategory(productCategory);
        inventory.addCategory(productCategory2);

        WarehouseSelectionStrategy warehouseSelectionStrategy = new NearestWarehouseStrategy();
        Warehouse warehouse = new Warehouse(inventory, address);
        WarehouseController warehouseController = new WarehouseController(warehouseSelectionStrategy);
        warehouseController.addWarehouse(warehouse);

        UserController userController = new UserController();
        User user = userController.createUser("user1");
        user.getCart().addCartItem(product1.getProductId(), 10);
        user.getCart().addCartItem(product2.getProductId(), 10);

        Invoice invoice = new Invoice(0.1, user.getCart().getTotalAmount(productController));
        PaymentStrategy paymentStrategy = new UPIPayment();
        Address deliveryAddress = new Address("deliveryAddress");
        OrderStatus orderStatus = OrderStatus.IN_PROGRESS;
        Order order = new Order(user, deliveryAddress, user.getCart().getCartItems(), invoice, paymentStrategy, orderStatus);
        order.getPaymentStrategy().makePayment(order);

    }
}
