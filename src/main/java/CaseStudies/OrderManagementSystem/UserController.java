package CaseStudies.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public User createUser(String userName) {
        return new User(userName);
    }
}
