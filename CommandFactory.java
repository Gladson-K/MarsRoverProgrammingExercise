package com.exercise.marsrover;


public class CommandFactory {
    public static Command createCommand(String command) {
        return switch (command.trim()) {
            case "M" -> new MoveCommand();
            case "L" -> new TurnLeftCommand();
            case "R" -> new TurnRightCommand();
            default -> throw new IllegalArgumentException("Invalid command: " + command);
        };
    }

    public static Command[] createCommands(String[] commandStrings) {
        Command[] commands = new Command[commandStrings.length];
        for (int i = 0; i < commandStrings.length; i++) {
            commands[i] = createCommand(commandStrings[i]);
        }
        return commands;
    }
}
