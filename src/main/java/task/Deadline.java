package task;

import task.TaskType;

public class Deadline extends Task {
    private String deadline;

    public Deadline(String taskName, boolean done, String deadline) {
        super(taskName, done);
        this.deadline = deadline;
        setTaskType(TaskType.DEADLINE);
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public void printDue() {
        System.out.println(" (by: " + deadline + ")");
    }

    @Override
    public String toFileFormat() {
        return "D," + getIsDone() + "," + getTaskName() + "," + getDeadline() +"\n";
    }

}
