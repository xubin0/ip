package task;

import util.DateTimeFormatTool;

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
        if(DateTimeFormatTool.isValidDateTimeFormat(deadline)) {
            System.out.println(" (by: " + DateTimeFormatTool.parseDateTime(deadline) + ")");

        }else {
            System.out.println(" (by: " + deadline + ")");
        }
    }

    @Override
    public String toFileFormat() {
        return "D," + getIsDone() + "," + getTaskName() + "," + getDeadline() +"\n";
    }

}
