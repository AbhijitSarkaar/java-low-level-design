package DesignPatterns.ObserverPattern.PushModel;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(false);
        WeatherStation weatherStation = new WeatherStation(weatherData);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(forecastDisplay);

        weatherData.setRainy(true);
        weatherStation.setWeatherReadings(weatherData);

        weatherStation.removeObserver(forecastDisplay);

        weatherData.setRainy(false);
        weatherStation.setWeatherReadings(weatherData);

    }
}
