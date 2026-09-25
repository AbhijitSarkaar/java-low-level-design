package CaseStudies.OrderManagementSystem;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void makePayment(Order order) {
        System.out.println("payment completed");
        order.setOrderStatus(OrderStatus.DELIVERED);

        System.out.println("Order details");
        System.out.println("user " + order.getUser().getUserName());
        System.out.println("delivery address " + order.getDeliveryAddress().getLocation());
        System.out.println("invoice amount " + order.getInvoice().getTotalAmount());
        System.out.println("order status " + order.getOrderStatus());
    }
}
