package am.ak.design.observeble.book.display;

import am.ak.design.observeble.book.Observer;
import am.ak.design.observeble.book.Subject;

public class ForecastDisplay implements DisplayElement, Observer {

    private final Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject weatherData) {
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temp + " " + humidity + " " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
