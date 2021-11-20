package com.adb.command;

public class NoCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Nothing");
  }

  @Override
  public void undo() {
    System.out.println("Also nothing");
  }
}
