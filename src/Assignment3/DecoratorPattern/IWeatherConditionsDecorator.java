package Assignment3.DecoratorPattern;

import Assignment3.ObserverPattern.intf.WeatherDataObserver;

public interface IWeatherConditionsDecorator extends WeatherDataObserver {
    void update(float humidity, float temperature);
}
