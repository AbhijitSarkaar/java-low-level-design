package CaseStudies.Splitwise.Controller;

import CaseStudies.Splitwise.Entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserController {
    Map<UUID, User> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public User createUser(String userName) {
        User user = new User(userName);
        users.put(user.getUserId(), user);
        return user;
    }

    public User getUserById(UUID userId) {
        return users.get(userId);
    }
}
