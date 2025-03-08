package task;

import task.TaskType;

public class Todo extends Task {
    public Todo(String taskName, boolean done) {
        super(taskName, done);
        super.setTaskType(TaskType.TODO);
    }

    @Override
    public String toFileFormat() {
        return "T," + getIsDone() + "," + getTaskName() + ","+"\n";
    }


}
