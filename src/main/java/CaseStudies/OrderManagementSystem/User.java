package CaseStudies.OrderManagementSystem;

import java.util.UUID;

public class User {
    UUID userId;
    String userName;
    Cart cart;

    public User(String userName) {
        this.userId = UUID.randomUUID();
        this.cart = new Cart();
        this.userName = userName;
    }

    public Cart getCart() {
        return cart;
    }

    public String getUserName() {
        return userName;
    }
}
