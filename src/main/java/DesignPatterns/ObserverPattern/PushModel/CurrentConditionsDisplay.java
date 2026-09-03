package DesignPatterns.ObserverPattern.PushModel;

public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("CurrentConditionsDisplay.update() :: weatherData.getRainy() " + weatherData.getRainy());
    }
}
