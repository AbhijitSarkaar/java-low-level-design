package CaseStudies.BookMyShow.City;

import java.util.HashMap;

public class CityManager {
    HashMap<String, City> cities;

    public CityManager() {
        this.cities = new HashMap<>();
    }

    public void addCity(City city) {
        cities.put(city.getCityName(), city);
    }

    public City getCity(String cityName) {
        return cities.get(cityName);
    }
}
