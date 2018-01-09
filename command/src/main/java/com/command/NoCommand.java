package com.command;

/**
 * Null Object Pattern
 * Created by Mahmut on 1/7/2018.
 */
public class NoCommand implements Command {
    private final boolean isUndoable = false;

    /**
     * change the method for null objects
     */
    public boolean execute() {
        System.out.println("Please choose a command");
        return isUndoable;
    }

    public void undo() {

    }
}
