package CaseStudies.OrderManagementSystem;

import java.util.Map;
import java.util.UUID;

public class Order {
    User user;
    Address deliveryAddress;
    Map<UUID, Integer> cartItems;
    Invoice invoice;
    PaymentStrategy paymentStrategy;
    OrderStatus orderStatus;

    public Order(User user, Address deliveryAddress, Map<UUID, Integer> cartItems, Invoice invoice, PaymentStrategy paymentStrategy, OrderStatus orderStatus) {
        this.user = user;
        this.deliveryAddress = deliveryAddress;
        this.cartItems = cartItems;
        this.invoice = invoice;
        this.paymentStrategy = paymentStrategy;
        this.orderStatus = orderStatus;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Map<UUID, Integer> getCartItems() {
        return cartItems;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public User getUser() {
        return user;
    }
}
