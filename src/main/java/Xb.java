import command.*;
import java.io.File;
import java.io.IOException;
import task.TaskList;
import java.util.Scanner;

import static util.FileHandler.loadTasks;
import static util.FileHandler.saveTasks;
//forgot to commit to level 7

public class Xb {
    private static final String DIRECTORY_PATH = "./data";
    private static final String FILE_PATH = "./data/Xb.txt";

    public static void main(String[] args) {
        createFileIfNotExists(FILE_PATH);
        TaskList taskList = loadTasks();
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
        saveTasks(taskList);
    }



    public static void createFileIfNotExists(String filePath) {
        File file = new File(filePath);
        File directory = new File(DIRECTORY_PATH);

        try {
            if (!directory.exists()) {
                boolean dirCreated = directory.mkdirs();
                if (dirCreated) {
                    System.out.println("Created directory: " + DIRECTORY_PATH);
                }
            }

            if (!file.exists()) {
                boolean fileCreated = file.createNewFile(); // Creates file if missing
                if (fileCreated) {
                    System.out.println("Created file: " + filePath);
                }
            } else {
                System.out.println("File already exists: " + filePath);
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}


