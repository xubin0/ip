
import task.TaskList;
import util.UI;

import FileHandler.FileCreator;

import static FileHandler.FileLoader.loadTasks;

public class Xb {
    private static final String DIRECTORY_PATH = "./data";
    private static final String FILE_PATH = "./data/Xb.txt";

    public static void main(String[] args) {
        FileCreator.createFileIfNotExists(FILE_PATH, DIRECTORY_PATH);
        TaskList taskList = loadTasks();
        UI ui = new UI(taskList);

    }


}



