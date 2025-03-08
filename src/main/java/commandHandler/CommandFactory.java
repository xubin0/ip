package commandHandler;

import commands.*;
import util.CommandListPrinter;

public class CommandFactory {

    public static Command createCommand(String commandString) {
        switch (commandString.toUpperCase()) {
        case "MARK":
            return new MarkCommand();
        case "UNMARK":
            return new UnmarkCommand();
        case "TODO":
            return new TodoCommand();
        case "DEADLINE":
            return new DeadlineCommand();
        case "EVENT":
            return new EventCommand();
        case "LIST":
            return new ListCommand();
        case "BYE":
            return new ByeCommand();
        case "DELETE":
            return new DeleteCommand();
        case "FIND":
            return new FindCommand();
        default:
            System.out.println("Sorry, Xb does not know what \"" + commandString + "\" means");
            System.out.println("Valid commands are:");
            CommandListPrinter.printCommands();

        }
        return null;
    }
}