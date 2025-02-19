package task;

import command.CommandList;

public class Todo extends Task {
    public Todo(String taskName, boolean done) {
        super(taskName, done);
        super.setTaskType(CommandList.TODO);
    }

    @Override
    public String toFileFormat() {
        return "T," + getIsDone() + "," + getTaskName() + ","+"\n";
    }


}
