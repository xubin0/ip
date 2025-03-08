package commands;

import task.TaskList;

public class ByeCommand implements Command {
    @Override
    public void execute(String parts, TaskList taskList) {
        System.out.println("Bye. Hope to see you again soon!");
    }


}
