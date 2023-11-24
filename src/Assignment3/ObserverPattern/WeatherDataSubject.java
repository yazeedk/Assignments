package ObserverPattern;

import ObserverPattern.intf.IWeatherDataSubject;
import ObserverPattern.intf.WeatherDataObserver;

import java.util.ArrayList;

public class WeatherDataSubject implements IWeatherDataSubject {
    private static ArrayList<WeatherDataObserver> observers = null;
    private int temperature;
    private int humidity;
    public WeatherDataSubject(){
        observers = new ArrayList<>();
    }
    public static void registerObserver(WeatherDataObserver weatherDataObserver) {
        observers.add(weatherDataObserver);
    }
    @Override
    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(this.temperature, this.humidity);
        }
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}

