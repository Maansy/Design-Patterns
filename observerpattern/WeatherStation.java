package observerpattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65 , 30.4f);
        weatherData.setMeasurements(85,35 , 37.4f);
        weatherData.setMeasurements(20,95 , 20.4f);

    }
}
