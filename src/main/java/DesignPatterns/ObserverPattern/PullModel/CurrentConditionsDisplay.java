package DesignPatterns.ObserverPattern.PullModel;

public class CurrentConditionsDisplay implements WeatherObserver {

    private WeatherStation weatherStation;

    CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("CurrentConditionsDisplay.update() :: weatherStation.getWeatherData().getRainy() " + weatherStation.getWeatherData().getRainy());
    }

}
