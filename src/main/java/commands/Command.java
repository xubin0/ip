package commands;

import task.TaskList;

public interface Command {
    void execute(String parts, TaskList taskList);
}
