package com.command.TVCommand;

import com.command.Command;
import com.receiver.TV;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class TVOnCommand implements Command {
    private TV tv;
    private final boolean isUndoable = true;
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public boolean execute() {
        tv.turnOn();
        return isUndoable;
    }

    public void undo() {

    }
}
