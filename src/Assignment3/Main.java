import DecoratorPattern.PrecipitationDecorator;
import DecoratorPattern.TemperatureUnitsDecorator;
import DecoratorPattern.WindSpeedDecorator;
import ObserverPattern.CurrentConditionsDisplay;
import ObserverPattern.StatisticsDisplay;
import ObserverPattern.WeatherDataSubject;
public class Main {
    public static void main(String[] args) {

        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        TemperatureUnitsDecorator temperatureUnitsDecorator = new TemperatureUnitsDecorator(currentConditions);
        WindSpeedDecorator windSpeedDecorator = new WindSpeedDecorator(currentConditions);
        PrecipitationDecorator precipitationDecorator = new PrecipitationDecorator();


        WeatherDataSubject.registerObserver(currentConditions);
        WeatherDataSubject.registerObserver(statisticsDisplay);
        WeatherDataSubject.registerObserver(temperatureUnitsDecorator);
        WeatherDataSubject.registerObserver(windSpeedDecorator);


        weatherData.setTemperature((int) 20.5f);
        weatherData.setHumidity((int) 25.9);
        weatherData.notifyObservers();

        System.out.println("_______________________________________");
        weatherData.setTemperature((int) 26.1f);
        weatherData.setHumidity((int) 40.3f);
        weatherData.notifyObservers();
        System.out.println("_______________________________________");

        windSpeedDecorator.display(10.5f);
        precipitationDecorator.update(20,15);
   }
}
