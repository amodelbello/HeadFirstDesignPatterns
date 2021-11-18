package com.adb.decorator.Condiment;

import com.adb.decorator.Beverage;
import com.adb.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.10;
  }
}
