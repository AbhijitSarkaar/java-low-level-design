package DesignPatterns.ObserverPattern.PullModel;

public interface WeatherObservable {
    public void addObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);

    public void notifyObservers();

    public void setWeatherReadings(WeatherData weatherData);
}
