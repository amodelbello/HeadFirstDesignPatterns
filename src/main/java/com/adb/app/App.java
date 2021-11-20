package com.adb.app;

import com.adb.command.*;
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
    runCommand();
    //    runSimpleCommand();
    //    runFactory();
    //    runDecorator();
    //    runObserver();
    //    runStrategy();
  }

  public static void runCommand() {
    RemoteControl remoteControl = new RemoteControl();
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor("Garage");
    Stereo stereo = new Stereo("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
    CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
    GarageDoorClosedCommand garageDoorClosed = new GarageDoorClosedCommand(garageDoor);
    StereoOnWithCDCommand stereoWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(3, stereoWithCD, stereoOff);

    System.out.println(remoteControl);

    //    remoteControl.onButtonWasPushed(0);
    //    remoteControl.offButtonWasPushed(0);
    //    remoteControl.onButtonWasPushed(1);
    //    remoteControl.offButtonWasPushed(1);
    //    remoteControl.onButtonWasPushed(2);
    //    remoteControl.offButtonWasPushed(2);
    //    remoteControl.onButtonWasPushed(3);
    //    remoteControl.offButtonWasPushed(3);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }

  public static void runSimpleCommand() {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);

    remote.setCommand(lightOn);
    remote.buttonWasPressed();
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
