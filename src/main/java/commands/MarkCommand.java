package commands;

import exception.XbException;
import task.TaskList;
import util.IntegerChecker;

public class MarkCommand implements Command {
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
