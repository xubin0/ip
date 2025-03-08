package commands;

public enum CommandList {
    MARK {
        @Override
        public void printCommand() {
            System.out.println("MARK: Marks a task as done. Usage: MARK <task_number>");
        }
    },
    UNMARK {
        @Override
        public void printCommand() {
            System.out.println("UNMARK: Marks a task as undone. Usage: UNMARK <task_number>");
        }
    },
    TODO {
        @Override
        public void printCommand() {
            System.out.println("TODO: Creates a new todo task. Usage: TODO <task_description>");
        }
    },
    DEADLINE {
        @Override
        public void printCommand() {
            System.out.println("DEADLINE: Creates a task with a deadline. Usage: DEADLINE <task_description> /by <deadline>");
        }
    },
    EVENT {
        @Override
        public void printCommand() {
            System.out.println("EVENT: Creates a task with an event. Usage: EVENT <task_description> /from <start_time> /to <end_time>");
        }
    },
    LIST {
        @Override
        public void printCommand() {
            System.out.println("LIST: Displays all tasks.");
        }
    },
    BYE {
        @Override
        public void printCommand() {
            System.out.println("BYE: Exits the application.");
        }
    },
    DELETE {
        @Override
        public void printCommand() {
            System.out.println("DELETE: Deletes a task. Usage: DELETE <task_number>");
        }
    };

    public abstract void printCommand();
}