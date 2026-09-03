package DesignPatterns.ObserverPattern.PullModel;

public class ForecastDisplay implements WeatherObserver {

    private WeatherStation weatherStation;

    ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("ForecastDisplay.update() :: weatherStation.getWeatherData().getRainy() " + weatherStation.getWeatherData().getRainy());
    }

}
