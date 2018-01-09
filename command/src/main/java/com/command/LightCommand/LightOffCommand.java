package com.command.LightCommand;

import com.command.Command;
import com.receiver.Light;

/**
 * Concrete Command
 * Created by Mahmut on 1/7/2018.
 */
public class LightOffCommand implements Command {
    private Light light;
    private final boolean isUndoable = true;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * turns off the light
     */
    public boolean execute() {
        light.off();
        System.out.println("Light has been turned off from " + this.getClass().getName());
        return isUndoable;
    }

    public void undo() {
        light.on();
        System.out.println("Light has been turned on from " + this.getClass().getName());
    }
}
