package DecoratorPattern;

import ObserverPattern.CurrentConditionsDisplay;

public class TemperatureUnitsDecorator implements IWeatherConditionsDecorator {
    private float temperature;
    public TemperatureUnitsDecorator(CurrentConditionsDisplay currentConditionsDisplay) {
    }
    @Override
    public void display(float temperatureUnit) {
        System.out.println("Temperature Unit in fehrenhite  Is : " + temperatureUnit);
        System.out.println("Temperature Unit in Celsius Is : " + temperatureUnit);
    }
    @Override
    public void update(float humidity, float temperature) {
        temperature *= 8 + 32;
        display(temperature);

    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getTemperature() {
        return temperature;
    }
}
