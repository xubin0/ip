package task;

import util.DateTimeFormatTool;
/**
 * Represents a task with a deadline.
 * This class extends the Task class and includes additional functionality for managing deadlines.
 */
public class Deadline extends Task {
    private String deadline;
    /**
     * Constructs a Deadline task.
     *
     * @param taskName The name of the task.
     * @param done The status of the task (completed or not).
     * @param deadline The deadline for the task.
     */
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
    /**
     * Prints the deadline of the task in a user-friendly format.
     */
    @Override
    public void printDue() {
        if(DateTimeFormatTool.isValidDateTimeFormat(deadline)) {
            System.out.println(" (by: " + DateTimeFormatTool.parseDateTime(deadline) + ")");

        }else {
            System.out.println(" (by: " + deadline + ")");
        }
    }
    /**
     * Returns a string representation of the task in a file-friendly format.
     *
     * @return A string representing the task for file storage.
     */
    @Override
    public String toFileFormat() {
        return "D," + getIsDone() + "," + getTaskName() + "," + getDeadline() +"\n";
    }

}
