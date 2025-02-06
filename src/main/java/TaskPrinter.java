public class TaskPrinter {
    public static void printTasks(Task task) {
        System.out.print(task.getTaskId() + ". ");
        printTaskType(task);
        printIsDone(task);
        System.out.println(task.getTaskName());
    }

    public static void printIsDone(Task task) {
        if (task.getIsDone()) {
            System.out.print("[X]"); //task done, print with X
        } else {
            System.out.print("[ ]"); //task not done print without X
        }
    }

    public static void printTaskType(Task task) {
        switch (task.getTaskType()) {
        case TASK:
            System.out.print("[ ]");
            break;
        case EVENT:
            System.out.print("[E]");
            break;
        case DEADLINE:
            System.out.print("[D]");
            break;
        case TODO:
            System.out.print("[T]");
            break;
        }
    }
}
