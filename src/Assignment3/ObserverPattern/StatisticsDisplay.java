package Assignment3.ObserverPattern;

import Assignment3.ObserverPattern.intf.WeatherDataObserver;
public class StatisticsDisplay implements WeatherDataObserver {
    private float temperature;
    private float humidity;
    public StatisticsDisplay(){
        WeatherDataSubject.registerObserver(this);

    }
    @Override
    public void update(float humidity, float temperature) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        display(temperature);
    }
    void converter(){
        int numReadings = 0;
        float averageTemperature = ((temperature) / (numReadings+1));
        float averageHumidity = ((humidity) / (numReadings+1));
        System.out.println("Temperature average : " + averageTemperature +"C" + ", Humidity average : "+ averageHumidity +"C");

    }
    @Override
    public void display(float temperature) {
        converter();
    }

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
