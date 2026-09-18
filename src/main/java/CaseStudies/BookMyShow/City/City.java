package CaseStudies.BookMyShow.City;

import CaseStudies.BookMyShow.Theatre.Theatre;
import CaseStudies.BookMyShow.Theatre.TheatreManager;

import java.util.UUID;

public class City {
    String cityName;
    UUID cityId;
    TheatreManager theatreManager;

    public City(String cityName) {
        this.cityName = cityName;
        this.cityId = UUID.randomUUID();
        this.theatreManager = new TheatreManager();
        setupTheatres();
    }

    public String getCityName() {
        return cityName;
    }

    void setupTheatres() {
        theatreManager.addTheatre(new Theatre(cityId));
        theatreManager.addTheatre(new Theatre(cityId));
    }

    public Theatre getTheatre() {
        return theatreManager.getTheatre();
    }
}
