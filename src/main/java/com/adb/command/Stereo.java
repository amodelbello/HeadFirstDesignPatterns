package com.adb.command;

public class Stereo {
  String name;

  public Stereo(String name) {
    this.name = name;
  }

  public Stereo() {
    name = "Unnamed Stereo";
  }

  public String getName() {
    return name;
  }

  public void on() {
    System.out.println(getName() + " stereo is on");
  }

  public void off() {
    System.out.println(getName() + " stereo is off");
  }

  public void setCD() {
    System.out.println(getName() + " CD mode is set");
  }

  public void setDVD() {
    System.out.println(getName() + " DVD mode is set");
  }

  public void setRadio() {
    System.out.println(getName() + " Radio mode is set");
  }

  public void setVolume(int volume) {
    System.out.println(getName() + " Volume is set to " + volume);
  }
}
