package com.adb.strategy;

import com.adb.strategy.Behavior.Fly.FlyNoWay;
import com.adb.strategy.Behavior.Quack.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck!");
  }
}
