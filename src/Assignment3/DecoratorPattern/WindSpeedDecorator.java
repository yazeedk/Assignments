package DecoratorPattern;

import ObserverPattern.CurrentConditionsDisplay;

public  class WindSpeedDecorator implements IWeatherConditionsDecorator{
    public WindSpeedDecorator(CurrentConditionsDisplay currentConditionsDisplay) {
    }
    @Override
    public void display(float windSpeed) {
        System.out.println("Wind Speed Is: " + windSpeed);
    }
    @Override
    public void update(float humidity, float temperature) {

    }
}
