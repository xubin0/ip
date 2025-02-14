package task;

import command.CommandList;

public class Todo extends Task {
    public Todo(int taskId, String taskName, boolean done) {
        super(taskId, taskName, done);
        super.setTaskType(CommandList.TODO);
    }

}
