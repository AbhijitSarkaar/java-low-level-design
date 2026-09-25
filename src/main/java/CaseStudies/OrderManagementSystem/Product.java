package CaseStudies.OrderManagementSystem;

import java.util.UUID;

public class Product {
    UUID productId;
    String productName;

    public Product(String productName) {
        this.productName = productName;
        this.productId = UUID.randomUUID();
    }

    public UUID getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
