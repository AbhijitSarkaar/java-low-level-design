package DesignPatterns.ObserverPattern.PullModel;

public class WeatherData {
    private Boolean rainy;

    WeatherData(Boolean rainy) {
        this.rainy = rainy;
    }

    public void setRainy(Boolean rainy) {
        this.rainy = rainy;
    }

    public Boolean getRainy() {
        return rainy;
    }
}
