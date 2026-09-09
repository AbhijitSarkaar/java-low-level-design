package CaseStudies.CarRental;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem() {
        this.stores = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addStores(Store store) {
        this.stores.add(store);
    }

    public void addUsers(User user) {
        this.users.add(user);
    }
}
