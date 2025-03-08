package commands;

import exception.XbException;
import task.Event;
import task.TaskList;

public class EventCommand implements Command {
    @Override
    public void execute(String parts, TaskList taskList) {
        try {
            if (parts.contains("/from") && parts.contains("/to")) {
                String[] eventParts = parts.split("/from|/to");
                String taskName = eventParts[0].trim();
                String from = eventParts[1].trim();
                String to = eventParts[2].trim();
                Event event = new Event(taskName, false, from, to);
                taskList.addTask(event);
            } else {
                throw XbException.invalidEventCommand();
            }
        } catch (XbException e) {
            System.out.println(e.getMessage());
        }
    }


}
