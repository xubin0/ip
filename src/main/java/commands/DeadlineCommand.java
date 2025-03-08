package commands;

import exception.XbException;
import task.Deadline;
import task.TaskList;
/**
 * Represents the "DEADLINE" command that creates a task with a deadline.
 * The command expects the description of the task and a "/by" tag for the deadline.
 */
public class DeadlineCommand implements Command {
    /**
     * Executes the "DEADLINE" command by parsing the task description and deadline,
     * and adding the deadline task to the task list.
     *
     * @param parts The command parts containing the task description and deadline.
     * @param taskList The task list where the new deadline task will be added.
     */
    @Override
    public void execute(String parts, TaskList taskList) {
        try {
            if (parts.contains("/by")) {
                String[] deadlineParts = parts.split("/by", 2);
                String taskName = deadlineParts[0].trim();
                String deadline = deadlineParts[1].trim();
                Deadline dl = new Deadline(taskName, false, deadline);
                taskList.addTask(dl);
            } else {
                throw XbException.invalidDeadlineCommand();
            }
        } catch (XbException e) {
            System.out.println(e.getMessage());
        }

    }
}


