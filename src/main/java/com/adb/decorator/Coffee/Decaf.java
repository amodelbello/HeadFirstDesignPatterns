package com.adb.decorator.Coffee;

import com.adb.decorator.Beverage;

public class Decaf extends Beverage {
  public Decaf() {
    description = "Decaf";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
