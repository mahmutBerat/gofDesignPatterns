package com.command.TVCommand;

import com.command.Command;
import com.receiver.TV;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class TVOffCommand implements Command{
    private TV tv;
    private final boolean isUndoable = true;
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public boolean execute() {
        tv.turnOff();
        return isUndoable;
    }

    public void undo() {
        tv.turnOn();
        System.out.println("Tv off operation undone from " + this.getClass().getName());
    }
}
