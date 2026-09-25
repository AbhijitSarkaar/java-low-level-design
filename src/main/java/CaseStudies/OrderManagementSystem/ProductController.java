package CaseStudies.OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductController {
    Map<UUID, Double> prices;

    public ProductController() {
        this.prices = new HashMap<>();
    }

    public Product createProduct(String productName) {
        return new Product(productName);
    }

    public void setPrice(UUID productId, Double amount) {
        prices.put(productId, amount);
    }

    public double getPrice(UUID productId) {
        return prices.get(productId);
    }
}
