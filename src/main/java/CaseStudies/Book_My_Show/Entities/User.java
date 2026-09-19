package CaseStudies.Book_My_Show.Entities;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
