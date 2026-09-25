package CaseStudies.OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Cart {
    UUID cartId;
    Map<UUID, Integer> cartItems;

    public Cart() {
        this.cartItems = new HashMap<>();
        this.cartId = UUID.randomUUID();
    }

    public UUID getCartId() {
        return cartId;
    }

    public Map<UUID, Integer> getCartItems() {
        return cartItems;
    }

    public void addCartItem(UUID productId, int quantity) {
        int count;
        if(cartItems.get(productId) == null) {
            count = quantity;
        } else count = cartItems.get(productId) + quantity;
        cartItems.put(productId, count);
    }

    public double getTotalAmount(ProductController productController) {
        double totalPrice = 0;
        for(UUID key: cartItems.keySet()) {
            totalPrice += cartItems.get(key) * productController.getPrice(key);
        }
        return totalPrice;
    }
}
