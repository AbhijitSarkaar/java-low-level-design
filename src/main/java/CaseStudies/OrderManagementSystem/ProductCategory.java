package CaseStudies.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductCategory {
    UUID categoryId;
    List<Product> products;
    double price;

    public ProductCategory(double price) {
        this.products = new ArrayList<>();
        this.price = price;
        this.categoryId = UUID.randomUUID();
    }

    public void addProduct(Product product, ProductController productController) {
        productController.setPrice(product.getProductId(), price);
        products.add(product);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", products=" + products +
                ", price=" + price +
                '}';
    }
}
