package commands;

import exception.XbException;
import task.Deadline;
import task.TaskList;

public class DeadlineCommand implements Command {
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


