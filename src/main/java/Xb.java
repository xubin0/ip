import java.util.Scanner;


public class Xb {
    public static final int MAX_LIST_SIZE = 100;


    public static void main(String[] args) {
        TaskList taskList = new TaskList(MAX_LIST_SIZE);
        Scanner s = new Scanner(System.in);

        System.out.println("Hello, I am xb!");
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.print(name);
        System.out.println(", what can I do for you?");

        String command;

        while (true) {
            command = s.nextLine().trim();
            String[] parts = command.split("\\s+", 2);

            switch (parts[0]) {
            case "mark":
                if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                    taskList.markTaskAsDone(Integer.parseInt(parts[1]));
                }
                break;

            case "unmark":
                if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                    taskList.markTaskAsUndone(Integer.parseInt(parts[1]));
                }
                break;

            case "todo":
                if (parts.length == 2) {
                    Todo todo = new Todo(taskList.getTaskCount() + 1, parts[1], false);
                    taskList.addTask(todo);
                }
                break;

            case "deadline":
                if (parts.length == 2 && parts[1].contains("/by")) {
                    String[] deadlineParts = parts[1].split("/by", 2);
                    String taskName = deadlineParts[0].trim();
                    String deadline = deadlineParts[1].trim();
                    Deadline dl = new Deadline(taskList.getTaskCount() + 1, taskName, false, deadline);
                    taskList.addTask(dl);
                }
                break;
            case "event":
                if (parts.length == 2 && parts[1].contains("/from") && parts[1].contains("/to")) {
                    String[] eventParts = parts[1].split("/from|/to");
                    String taskName = eventParts[0].trim();
                    String from = eventParts[1].trim();
                    String to = eventParts[2].trim();
                    Event event = new Event(taskList.getTaskCount() + 1, taskName, false, from, to);
                    taskList.addTask(event);
                }
                break;

            case "list":
                taskList.printList();
                break;

            case "bye":
                System.out.println("Bye. Hope to see you again soon!");
                s.close();
                return;

            default:
                Task task = new Task(taskList.getTaskCount() + 1, command);
                taskList.addTask(task);
                break;
            }
        }

    }

}
