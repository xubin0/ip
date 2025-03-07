package util;

import command.CommandChecker;
import command.CommandHandler;
import command.CommandParser;
import task.TaskList;

import java.util.Scanner;

import static FileHandler.FileSaver.saveTasks;

public class UI {
    Scanner s = new Scanner(System.in);

    public UI(TaskList taskList) {
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
            CommandChecker cc = new CommandChecker(cp.getParts());
            if (cc.isValidCommand()) {
                run = c.runCommand(cp.getParts());
            }

        }
        saveTasks(taskList);
        s.close();
    }

}

