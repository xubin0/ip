package commandHandler;

public class CommandParser {
    private String[] parts;

    public CommandParser(String command) {
        parts = command.split("\\s+", 2);
        if (parts.length == 1) {
            parts = new String[] { parts[0], "" };
        }
    }

    public String[] getParts() {
        return parts;
    }

}
