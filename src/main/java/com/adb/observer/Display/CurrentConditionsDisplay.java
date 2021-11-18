package com.adb.observer.Display;

import com.adb.observer.Interface.DisplayElement;
import com.adb.observer.Interface.Observer;
import com.adb.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private final WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  public void display() {
    System.out.println(
        "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
