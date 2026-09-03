package DesignPatterns.ObserverPattern.PullModel;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(false);
        WeatherStation weatherStation = new WeatherStation(weatherData);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        weatherData.setRainy(true);
        weatherStation.setWeatherReadings(weatherData);

    }
}
