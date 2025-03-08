package commandHandler;

import commands.*;
import util.CommandListPrinter;

/**
 * The CommandFactory class is responsible for creating the appropriate Command object based on the
 * command string passed to it. This class is used to instantiate the correct command type for a given user input.
 * <p>
 * Example:
 * If the input is "TODO", the factory will create a TodoCommand.
 * <p>
 * The factory method ensures that the correct command is created, so that it can be executed in the CommandHandler.
 */
public class CommandFactory {

    /**
     * Creates the appropriate Command object based on the provided command string.
     * This method matches the command string with a predefined set of valid commands
     * and returns the corresponding Command object.
     *
     * @param commandString The command string to match and create the corresponding Command object.
     * @return A Command object corresponding to the provided command string.
     * Returns null if the command is invalid.
     */
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
        case"RENAME":
            return new RenameCommand();
        default:
            System.out.println("Sorry, Xb does not know what \"" + commandString + "\" means");
            System.out.println("Valid commands are:");
            CommandListPrinter.printCommands();

        }
        return null;
    }
}