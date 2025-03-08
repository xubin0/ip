package exception;

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

}
