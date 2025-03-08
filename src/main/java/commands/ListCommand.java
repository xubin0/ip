package commands;

import task.TaskList;

public class ListCommand implements Command {
    @Override
    public void execute(String parts, TaskList taskList) {
        if (taskList.getTaskCount() > 0) {
            taskList.printTaskList();
            return;
        }
        System.out.println("nothing to do yet");
    }
}
