package Assignment3.ObserverPattern;

import Assignment3.ObserverPattern.intf.IWeatherDataSubject;
import Assignment3.ObserverPattern.intf.WeatherDataObserver;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    private float temperature;
    private float humidity;
    @Override
    public void display(float temperature) {
        update(humidity,temperature);
    }
    @Override
    public void update(float humidity, float temperature) {
        System.out.println("Current Humidity :" +this.humidity+"%"+ ", Current Temperature : " + this.temperature+"C");
    }
    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
        //this.update(humidity);
    }
}
