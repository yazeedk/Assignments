package Assignment3.ObserverPattern.intf;

public interface WeatherDataObserver {
    default void display(float weatherData) {
    }
    void update(float humidity, float temperature);
}
