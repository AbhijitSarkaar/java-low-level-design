package CaseStudies.OrderManagementSystem;

public class Warehouse {
    Inventory inventory;
    Address address;

    public Warehouse(Inventory inventory, Address address) {
        this.inventory = inventory;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "inventory=" + inventory +
                ", address=" + address +
                '}';
    }
}
