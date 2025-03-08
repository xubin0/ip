package exception;
/**
 * Custom exception class for handling various invalid command inputs in the application.
 * This class provides specific methods for each type of invalid command that may be thrown during user input.
 */
public class XbException extends Exception {
    public XbException(String message) {
        super(message);
    }

    public static XbException invalidMarkCommand() {
        return new XbException("Invalid mark command, please specify which task to mark with an integer.");
    }

    public static XbException invalidUnmarkCommand() {
        return new XbException("Invalid unmark command, please specify which task to unmark with an integer.");
    }

    public static XbException invalidDeadlineCommand() {
        return new XbException("Invalid deadline command, please specify when deadline is in the future. with \"/by\".");
    }

    public static XbException invalidEventCommand() {
        return new XbException("Invalid event command, please specify duration of event with \"/from\" and \"/to\".");
    }
    public static XbException invalidTodoCommand() {
        return new XbException("Invalid Todo command, please name of Task to be done.");
    }
    public static XbException invalidDeleteCommand() {
        return new XbException("Invalid delete command, please specify which task to delete with an integer.");
    }
    public static XbException invalidFindCommand() {
        return new XbException("Invalid Find command, please specify Keyword to Find tasks.");
    }
    public static XbException invalidRenameCommand() {
        return new XbException("Invalid event command, please key command in the format: rename <task number> <new Name>.");
    }

}
