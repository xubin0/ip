package task;

import command.CommandList;

public class Event extends Task {
    private String eventStart;
    private String eventEnd;

    public Event(String taskName, boolean done, String eventStart, String eventEnd) {
        super(taskName, done);
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        setTaskType(CommandList.EVENT);
    }

    public String getEventEnd() {
        return eventEnd;
    }

    public String getEventStart() {
        return eventStart;
    }

    @Override
    public void printDue() {
        System.out.println( " (from: " + eventStart + " to: " + eventEnd + ")");
    }

    @Override
    public String toFileFormat() {
        return "E," + getIsDone() + "," + getTaskName() + "," + getEventStart() +"," +getEventEnd()+"\n";
    }


}
