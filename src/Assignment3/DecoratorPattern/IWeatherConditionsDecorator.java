package DecoratorPattern;

import ObserverPattern.intf.WeatherDataObserver;

public interface IWeatherConditionsDecorator extends WeatherDataObserver {
    void update(float humidity, float temperature);
}
