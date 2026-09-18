package CaseStudies.BookMyShow;

import CaseStudies.BookMyShow.City.City;
import CaseStudies.BookMyShow.City.CityManager;

public class App {
    CityManager cityManager;

    public App() {
        this.cityManager = new CityManager();
        setupCities();
    }

    void setupCities() {
        cityManager.addCity(new City("city1"));
        cityManager.addCity(new City("city2"));
    }

    public City getCity(String cityName) {
        return cityManager.getCity(cityName);
    }
}
