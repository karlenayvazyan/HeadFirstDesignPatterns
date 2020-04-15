package am.ak.design.observeble.java.display;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay CurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay ForecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay StatisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay ThirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
