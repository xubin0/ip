package command;

public class CommandChecker {
    private String[] parts;

    public CommandChecker(String[] parts) {
        this.parts = parts;
    }

    public boolean isValidLength() {
        try {
            int i =1/parts.length;
            return true;
        } catch (ArithmeticException e) {
            printInvalidLengthMessage();
            return false;
        }
    }

    public boolean isValidCommand() {
        try {
            CommandList.valueOf(parts[0].toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            printInvalidCommandMessage();
            return false;
        }
    }

    public void printInvalidCommandMessage() {
        System.out.println("Sorry, Xb does not know what \"" + parts[0] + "\"means");
        System.out.println("Valid commands are:");
        printCommandList();
    }

    public void printCommandList() {
        for (CommandList c : CommandList.values()) {
            System.out.println(c.toString());
        }
    }
    public void printInvalidLengthMessage(){
        System.out.println("Command Cannot be empty;");
    };

}
