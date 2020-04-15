package am.ak.design.observeble.book;

import am.ak.design.observeble.book.display.CurrentConditionsDisplay;
import am.ak.design.observeble.book.display.ForecastDisplay;
import am.ak.design.observeble.book.display.StatisticsDisplay;
import am.ak.design.observeble.book.display.ThirdPartyDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
