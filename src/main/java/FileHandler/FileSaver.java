package FileHandler;

import task.Task;
import task.TaskList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver
{
    private static final String FILE_PATH = "./data/Xb.txt";

    public static void saveTasks(TaskList tasks) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            ArrayList<Task> taskList = new ArrayList<>(tasks.getTasks());
            for (int i = 0; i < taskList.toArray().length; i++) {
                writer.write(taskList.get(i).toFileFormat() + "\n");
            }
            System.out.println("Tasks saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
}
