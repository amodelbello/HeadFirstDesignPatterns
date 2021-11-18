package com.adb.strategy;

import com.adb.strategy.Behavior.Fly.FlyWithWings;
import com.adb.strategy.Behavior.Quack.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard com.adb.strategy.Duck!");
  }
}
