package CaseStudies.Splitwise.Entity;

import java.util.UUID;

public class User {
    UUID userId;
    String userName;

    public User(String userName) {
        this.userName = userName;
        this.userId = UUID.randomUUID();
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

}
