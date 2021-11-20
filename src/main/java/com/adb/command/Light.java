package com.adb.command;

public class Light {
  private String name;

  public Light(String name) {
    this.name = name;
  }

  public Light() {
    name = "Unnamed light";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println("The " + getName() + " light was turned on okay?");
  }

  public void off() {
    System.out.println("The " + getName() + " light was turned off okay?");
  }
}
