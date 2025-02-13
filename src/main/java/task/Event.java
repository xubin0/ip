package task;

public class Event extends Task {
    private String eventStart;
    private String eventEnd;

    public Event(int taskId, String taskName, boolean done, String evementStart, String eventEnd) {
        super(taskId, taskName, done);
        this.eventStart = evementStart;
        this.eventEnd = eventEnd;
        setTaskType(TaskType.EVENT);
    }

    @Override
    public void printTask() {
        super.printTask();
        System.out.print( " (from: " + eventStart + " to: " + eventEnd + ")");
    }


}
