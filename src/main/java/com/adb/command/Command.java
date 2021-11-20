package com.adb.command;

public interface Command {
  public void execute();

  public void undo();
}
