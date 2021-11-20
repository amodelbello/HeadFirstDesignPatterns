package com.adb.command;

public class GarageDoorClosedCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorClosedCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    this.garageDoor.down();
  }

  @Override
  public void undo() {
    garageDoor.up();
  }
}
