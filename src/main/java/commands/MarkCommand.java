package commands;

import exception.XbException;
import task.TaskList;
import util.IntegerChecker;
/**
 * Represents the "MARK" command that marks a task as completed.
 * The command expects a task number to mark the corresponding task as done.
 */
public class MarkCommand implements Command {
    /**
     * Executes the "MARK" command by marking the specified task as done.
     * It verifies that the provided task number is valid before marking the task.
     *
     * @param parts The task number to mark as done.
     * @param taskList The task list where the task will be marked as done.
     */
    @Override
    public void execute(String parts, TaskList taskList) {
        try {
            if (IntegerChecker.isInteger(parts)) {
                taskList.markTaskAsDone(Integer.parseInt(parts));
            } else {
                throw XbException.invalidMarkCommand();
            }
        } catch (XbException e) {
            System.out.println(e.getMessage());
        }
    }

}
