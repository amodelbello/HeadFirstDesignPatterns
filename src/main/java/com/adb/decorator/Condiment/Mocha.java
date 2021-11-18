package com.adb.decorator.Condiment;

import com.adb.decorator.Beverage;
import com.adb.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.20;
  }
}
