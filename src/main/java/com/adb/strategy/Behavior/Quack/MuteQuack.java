package com.adb.strategy.Behavior.Quack;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<<< Silence >>>");
  }
}
