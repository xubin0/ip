package task;

import command.CommandList;

public class Deadline extends Task {
    private String deadline;

    public Deadline(int taskId, String taskName, boolean done, String deadline) {
        super(taskId, taskName, done);
        this.deadline = deadline;
        setTaskType(CommandList.DEADLINE);
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public void printTask() {
        super.printTask();
        System.out.print(" (by: " + deadline + ")");
    }

}
