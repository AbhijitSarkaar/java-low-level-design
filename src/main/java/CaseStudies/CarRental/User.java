package CaseStudies.CarRental;

import java.util.UUID;

public class User {
    UUID userId;
    String userName;
    String drivingLicenseNumber;

    public User(String userName, String drivingLicenseNumber) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public UUID getUserId() {
        return userId;
    }

}
