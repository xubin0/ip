import java.util.Scanner;

public class xb {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, I am xb!");
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.print(name);
        System.out.println(", what can I do for you?");
        String taskName;

        while (true) {
            taskName = s.nextLine().trim();
            String[] parts = taskName.split("\\s+", 2);
            if (parts.length == 2 && IntegerChecker.isInteger(parts[1])) {
                switch (parts[0]) {
                case "mark":
                    taskList.markTaskAsDone(Integer.parseInt(parts[1]));
                    break;
                case "unmark":
                    taskList.markTaskAsUndone(Integer.parseInt(parts[1]));
                    break;
                case "rename":
                    String newTaskName = s.nextLine().trim();
                    taskList.renameTask(Integer.parseInt(parts[1]), newTaskName);
                default:
                    break;
                }
            } else {
                if (taskName.equals("bye")) {
                    break;
                }
                if (taskName.equals("list")) {
                    System.out.println("These are the tasks:");
                    taskList.printList();
                    System.out.println("Input task name to continue adding task");
                    System.out.println("Use \"mark\" or \"unmark\" followed by task number to mark or unmark a task");
                    System.out.println("Use \"rename\" followed by task number to rename a task");
                    continue;
                }

                System.out.println("added: " + taskName);
                taskList.addTask(taskName);
            }
        }

        System.out.println("Bye. Hope to see you again soon!");
        s.close();
    }
}
