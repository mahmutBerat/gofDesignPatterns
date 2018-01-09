package com.command.LightCommand;

import com.command.Command;
import com.receiver.Light;

/**
 * Concrete Command
 * Created by Mahmut on 1/7/2018.
 */
public class LightOnCommand implements Command {
    private Light light;
    private final boolean isUndoable = true;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public boolean execute() {
        light.on();
        System.out.println("Light is opened in from LightOnCommand");
        return isUndoable;
    }

    public void undo() {
        light.off();
        System.out.println("Light on operation undone");
    }


}
