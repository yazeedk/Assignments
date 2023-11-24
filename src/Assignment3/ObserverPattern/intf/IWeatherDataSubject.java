package Assignment3.ObserverPattern.intf;

public interface IWeatherDataSubject {
    public void removeObserver(WeatherDataObserver weatherDataObserver);
    public void notifyObservers();
}
