package Assignment3.DecoratorPattern;

import Assignment3.ObserverPattern.StatisticsDisplay;

public class PrecipitationDecorator implements IWeatherConditionsDecorator {
    public PrecipitationDecorator() {

    }
    @Override
    public void update(float precipitation, float temperature) {
        System.out.println("The probability of rain falling today in your location is : " + precipitation +"%");
        display(precipitation);
    }
}