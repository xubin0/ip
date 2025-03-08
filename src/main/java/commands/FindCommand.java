package commands;

import exception.XbException;
import task.TaskList;

/**
 * Represents the "FIND" command that searches for tasks containing a specified keyword.
 * The command displays the tasks that match the keyword.
 */
public class FindCommand implements Command {
    private TaskList tasksWithKeyWord;
    /**
     * Executes the "FIND" command by searching for tasks that match the given keyword.
     * It prints the matching tasks to the user.
     *
     * @param parts The keyword used to search for tasks.
     * @param taskList The task list to search within.
     */
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
