import command.*;

import task.TaskList;
import java.util.Scanner;


public class Xb {
    public static final int MAX_LIST_SIZE = 100;


    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner s = new Scanner(System.in);

        System.out.println("Hello, I am xb!");
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.print(name);
        System.out.println(", what can I do for you?");
        String command;
        CommandHandler c = new CommandHandler(taskList);

        boolean run = true;
        while (run) {
            command = s.nextLine().trim();
            CommandParser cp = new CommandParser(command);
            CommandChecker cc= new CommandChecker(cp.getParts());
            if(cc.isValidCommand()) {
                run = c.runCommand(cp.getParts());
            }
        }
    }

}

