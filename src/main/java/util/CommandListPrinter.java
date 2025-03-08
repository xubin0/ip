package util;

import commands.CommandList;

public class CommandListPrinter {
    public static void printCommands() {
        System.out.println("Available commands:");

        // Loop through each enum constant in CommandList and call printCommand()
        for (CommandList command : CommandList.values()) {
            command.printCommand();
        }
    }
}