package com.adb.app;

import com.adb.decorator.Beverage;
import com.adb.decorator.Coffee.DarkRoast;
import com.adb.decorator.Coffee.Expresso;
import com.adb.decorator.Coffee.HouseBlend;
import com.adb.decorator.Condiment.Mocha;
import com.adb.decorator.Condiment.Soy;
import com.adb.decorator.Condiment.Whip;
import com.adb.factory.APizza;
import com.adb.factory.PizzaStore;
import com.adb.factory.PizzaType;
import com.adb.factory.Store.ChicagoPizzaStore;
import com.adb.factory.Store.NYPizzaStore;
import com.adb.observer.Display.CurrentConditionsDisplay;
import com.adb.observer.Display.ForecastDisplay;
import com.adb.observer.Display.StatisticsDisplay;
import com.adb.observer.WeatherData;
import com.adb.strategy.Behavior.Fly.FlyRocketPowered;
import com.adb.strategy.Duck;
import com.adb.strategy.MallardDuck;
import com.adb.strategy.ModelDuck;

public class App {
  public static void main(String[] args) {
    runFactory();
    //    runDecorator();
    //    runObserver();
    //    runStrategy();
  }

  public static void runFactory() {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    APizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }

  public static void runDecorator() {
    Beverage beverage = new Expresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    //    Beverage beverage2 = new DarkRoast();
    //    beverage2 = new Mocha(beverage2);
    //    beverage2 = new Mocha(beverage2);
    //    beverage2 = new Whip(beverage2);
    Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }

  public static void runObserver() {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    System.out.println("");
    weatherData.setMeasurements(80, 65, 30.4f);

    System.out.println("");
    weatherData.setMeasurements(82, 70, 29.2f);

    System.out.println("");
    weatherData.setMeasurements(78, 90, 29.2f);
  }

  public static void runStrategy() {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
