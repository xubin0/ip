package command;

import exception.XbException;
import task.*;
import util.IntegerChecker;


public enum CommandList {
    MARK {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            try {
                if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                    taskList.markTaskAsDone(Integer.parseInt(parts[1]));
                } else {
                    throw XbException.invalidMarkCommand();
                }
            } catch (XbException e) {
                System.out.println(e.getMessage());
            }
        }
    },
    UNMARK {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            try {
                if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                    taskList.markTaskAsUndone(Integer.parseInt(parts[1]));
                } else {
                    throw XbException.invalidUnmarkCommand();
                }
            } catch (XbException e) {
                System.out.println(e.getMessage());
            }
        }
    },
    TODO {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            try {
                if (parts.length == 2) {
                    Todo todo = new Todo(taskList.getTaskCount() + 1, parts[1], false);
                    taskList.addTask(todo);
                } else {
                    throw XbException.invalidTodoCommand();
                }
            } catch (XbException e) {
                System.out.println(e.getMessage());
            }

        }
    },
    DEADLINE {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            try {
                if (parts.length == 2 && parts[1].contains("/by")) {
                    String[] deadlineParts = parts[1].split("/by", 2);
                    String taskName = deadlineParts[0].trim();
                    String deadline = deadlineParts[1].trim();
                    Deadline dl = new Deadline(taskList.getTaskCount() + 1, taskName, false, deadline);
                    taskList.addTask(dl);
                } else {
                    throw XbException.invalidDeadlineCommand();
                }
            } catch (XbException e) {
                System.out.println(e.getMessage());
            }

        }
    },
    EVENT {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            try {
                if (parts.length == 2 && parts[1].contains("/from") && parts[1].contains("/to")) {
                    String[] eventParts = parts[1].split("/from|/to");
                    String taskName = eventParts[0].trim();
                    String from = eventParts[1].trim();
                    String to = eventParts[2].trim();
                    Event event = new Event(taskList.getTaskCount() + 1, taskName, false, from, to);
                    taskList.addTask(event);
                } else {
                    throw XbException.invalidEventCommand();
                }
            } catch (XbException e) {
                System.out.println(e.getMessage());
            }
        }
    },

    LIST {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (taskList.getTaskCount() > 0) {
                taskList.printTaskList();
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
    },

    DELETE {
        @Override
        public void execute(String[] parts, TaskList taskList) {
            if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                taskList.deleteTask(Integer.parseInt(parts[1]));
                System.out.println("deleted task " + parts[1]);
            }
        }
    };


    public abstract void execute(String[] parts, TaskList taskList);

}