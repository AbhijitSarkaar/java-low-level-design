package CaseStudies.CarRental;

import java.util.UUID;

public class Location {

    public UUID locationId;
    public String locationName;

    public Location(String locationName) {
        this.locationId = UUID.randomUUID();
        this.locationName = locationName;
    }
}
