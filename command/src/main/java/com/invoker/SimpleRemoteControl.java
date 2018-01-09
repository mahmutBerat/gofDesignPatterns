package com.invoker;

import com.command.Command;

import java.util.*;

/**
 * Invoker class
 * Created by Mahmut on 1/7/2018.
 */
public class SimpleRemoteControl {

    private Map commands = new HashMap<String, Command>();
    private Stack<Command> undoHistory = new Stack<Command>();
    private Stack<Command> redoHistory = new Stack<Command>();

    public SimpleRemoteControl(HashMap commands) {
        this.commands = commands;
    }

    public void addCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    /**
     *
     */
    public void buttonWasPressed(String commandName) {
        Command command = (Command) commands.get(commandName);
        boolean isUndoable = command.execute();
        if (isUndoable) {
            undoHistory.push(command);
        }
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            Command prevCommand = undoHistory.pop();
            prevCommand.undo();
        }
    }

    public void redo() {
        if (!undoHistory.isEmpty()) {
            Command command = redoHistory.pop();
            command.execute();
        }
    }
}
