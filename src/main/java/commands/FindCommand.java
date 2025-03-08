package commands;

import exception.XbException;
import task.TaskList;


public class FindCommand implements Command {
    private TaskList tasksWithKeyWord;

    @Override
    public void execute(String parts, TaskList taskList) {
        try {
            if (!parts.isEmpty()) {
                tasksWithKeyWord = taskList.getTaskListWithKeyWord(parts);

                if (tasksWithKeyWord.getTaskCount() > 0) {
                    tasksWithKeyWord.printTaskList();
                }
            } else {
                throw XbException.invalidFindCommand();
            }
        } catch (XbException e) {
            System.out.println(e.getMessage());
        }

    }
}
