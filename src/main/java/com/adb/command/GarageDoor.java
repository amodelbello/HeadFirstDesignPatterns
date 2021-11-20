package com.adb.command;

public class GarageDoor {
  String name;

  public GarageDoor(String name) {
    this.name = name;
  }

  public GarageDoor() {
    name = "Unnamed Garage door in " + getName() + "";
  }

  public String getName() {
    return name;
  }

  public void up() {
    System.out.println("Garage door in " + getName() + " is open");
  }

  public void down() {
    System.out.println("Garage door in " + getName() + " is closed");
  }

  public void stop() {
    System.out.println("Garage door in " + getName() + " is stopped");
  }

  public void lightOn() {
    System.out.println("Garage door in " + getName() + " light is on");
  }

  public void lightOff() {
    System.out.println("Garage door in " + getName() + " light is off");
  }
}
