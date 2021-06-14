package chapterTwo;

import chapterTwo.wheatherStation.WeatherData;
import chapterTwo.wheatherStation.display.CurrentConditionsDisplay;
import chapterTwo.wheatherStation.display.ForecastDisplay;
import chapterTwo.wheatherStation.display.HeatIndexDisplay;
import chapterTwo.wheatherStation.display.StatisticsDisplay;

public class ChapterTwo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
