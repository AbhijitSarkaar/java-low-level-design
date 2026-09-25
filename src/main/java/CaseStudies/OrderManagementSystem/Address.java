package CaseStudies.OrderManagementSystem;

public class Address {
    String location;

    public Address(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                '}';
    }
}
