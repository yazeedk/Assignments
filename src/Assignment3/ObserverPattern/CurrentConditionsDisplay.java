package ObserverPattern;

import ObserverPattern.intf.IWeatherDataSubject;
import ObserverPattern.intf.WeatherDataObserver;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    private float temperature;
    private float humidity;
    @Override
    public void display(float temperature) {
        WeatherDataObserver.super.display(Float.parseFloat((("Current Weather Condition : " + temperature))));
    }
    @Override
    public void update(float humidity, float temperature) {
        System.out.println("Current Humidity :" +humidity+"%"+ ", Current Temperature : " + temperature+"C");
        this.setTemperature(temperature);
        this.setHumidity(humidity);
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
