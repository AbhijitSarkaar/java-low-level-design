package DesignPatterns.ObserverPattern.PushModel;

public class ForecastDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("ForecastDisplay.update() :: weatherData.getRainy() " + weatherData.getRainy());
    }
}
