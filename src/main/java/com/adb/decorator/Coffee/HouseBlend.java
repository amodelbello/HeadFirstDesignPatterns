package com.adb.decorator.Coffee;

import com.adb.decorator.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
