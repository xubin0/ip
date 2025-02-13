package command;

public class CommandParser {
    private String[] parts;

    public CommandParser(String command) {
        parts = command.split("\\s+", 2);
    }

    public String[] getParts() {
        return parts;
    }

}
