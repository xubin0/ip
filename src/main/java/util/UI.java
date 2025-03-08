package util;

import commandHandler.CommandHandler;
import commandHandler.CommandParser;
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

        boolean run = true;
        while (run) {
            command = s.nextLine().trim();
            CommandParser cp = new CommandParser(command);
            CommandHandler c = new CommandHandler(taskList, cp.getParts());
                run = c.runCommand();

        }
        saveTasks(taskList);
        s.close();
    }

}

