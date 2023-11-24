package DecoratorPattern;

public abstract class WeatherConditionsDecorator implements IWeatherConditionsDecorator{
    public WeatherConditionsDecorator(IWeatherConditionsDecorator weatherConditionsDecorator) {
    }
}
