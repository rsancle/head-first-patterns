package chapterTwo.wheatherStation;

import java.util.ArrayList;

import chapterTwo.wheatherStation.observer.Observer;
import chapterTwo.wheatherStation.observer.Subject;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * This method gets called whenever the weather measurements have been updated
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
