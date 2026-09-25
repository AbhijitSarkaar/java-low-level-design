package CaseStudies.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Inventory {
    UUID inventoryId;
    List<ProductCategory> categories;

    public Inventory() {
        this.inventoryId = UUID.randomUUID();
        this.categories = new ArrayList<>();
    }

    public void addCategory(ProductCategory productCategory) {
        this.categories.add(productCategory);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", categories=" + categories +
                '}';
    }
}
