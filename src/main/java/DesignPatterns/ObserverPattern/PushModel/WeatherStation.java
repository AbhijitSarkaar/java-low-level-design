package DesignPatterns.ObserverPattern.PushModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private List<WeatherObserver> observers;
    private WeatherData weatherData;

    WeatherStation(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer: observers) {
            observer.update(weatherData);
        }
    }

    @Override
    public void setWeatherReadings(WeatherData weatherData) {
        this.weatherData.setRainy(weatherData.getRainy());
        notifyObservers();
    }

}
