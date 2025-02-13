package command;

import task.*;
import util.IntegerChecker;

public enum CommandList {
    MARK {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                taskList.markTaskAsDone(Integer.parseInt(parts[1]));
            }
        }
    },
    UNMARK {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                taskList.markTaskAsUndone(Integer.parseInt(parts[1]));
            }
        }
    },
    TODO {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2) {
                Todo todo = new Todo(taskList.getTaskCount() + 1, parts[1], false);
                taskList.addTask(todo);
            }

        }
    },
    DEADLINE {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2 && parts[1].contains("/by")) {
                String[] deadlineParts = parts[1].split("/by", 2);
                String taskName = deadlineParts[0].trim();
                String deadline = deadlineParts[1].trim();
                Deadline dl = new Deadline(taskList.getTaskCount() + 1, taskName, false, deadline);
                taskList.addTask(dl);
            }
        }
    },
    EVENT {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2 && parts[1].contains("/from") && parts[1].contains("/to")) {
                String[] eventParts = parts[1].split("/from|/to");
                String taskName = eventParts[0].trim();
                String from = eventParts[1].trim();
                String to = eventParts[2].trim();
                Event event = new Event(taskList.getTaskCount() + 1, taskName, false, from, to);
                taskList.addTask(event);
            }
        }
    },

    LIST {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if(taskList.getTaskCount() > 0) {
                taskList.printList();
                return;
            }
            System.out.println("nothing to do yet");
        }
    },
    BYE {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            System.out.println("Bye. Hope to see you again soon!");
        }
    };

    public abstract void execute(String[] parts, TaskList taskList);

}