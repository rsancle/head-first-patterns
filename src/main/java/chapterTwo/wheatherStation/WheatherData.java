package chapterTwo.wheatherStation;

import chapterTwo.wheatherStation.observer.Subject;

public class WheatherData implements Subject {
    public float getTemperature() {
        return 0;
    }

    public float getHumidity() {
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    /**
     * This method gets called whenever the weather measurements have been updated
     */
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    @Override
    public void registerObserver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub

    }
}
