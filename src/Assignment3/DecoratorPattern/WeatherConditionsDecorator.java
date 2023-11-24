package Assignment3.DecoratorPattern;

import Assignment3.DecoratorPattern.IWeatherConditionsDecorator;

public abstract class WeatherConditionsDecorator implements IWeatherConditionsDecorator {
    public WeatherConditionsDecorator(IWeatherConditionsDecorator weatherConditionsDecorator) {
    }
}
