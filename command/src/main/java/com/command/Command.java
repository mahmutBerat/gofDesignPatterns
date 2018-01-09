package com.command;

/**
 * Created by Mahmut on 1/7/2018.
 */
public interface Command {
    boolean execute();
    void undo();
}
