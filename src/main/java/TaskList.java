public class TaskList {
    private int taskCount;
    private Task[] tasks;
    private final int listSize;

    public TaskList(int listSize) {
        taskCount = 0;
        tasks = new Task[listSize];
        this.listSize = listSize;
    }


    public void addTask(Task task) {
        if (taskCount == listSize) {
            System.out.println("max task count reached. Task not added");
        } else {
            taskCount++;
            tasks[taskCount - 1] = task;
            System.out.println("task added:");
            task.printTask();
            System.out.println();
            System.out.println("Now you have " + taskCount + " tasks in the list.");
        }
    }

    public void addTask(Todo todo) {
        if (taskCount == listSize) {
            System.out.println("max task count reached. Task not added");
        } else {
            tasks[taskCount++] = todo;
            System.out.println("task added:");
            todo.printTask();
            System.out.println();
            System.out.println("Now you have " + taskCount + " tasks in the list.");
        }
    }

    public void addTask(Deadline deadline) {
        if (taskCount == listSize) {
            System.out.println("max task count reached. Task not added");
        } else {
            tasks[taskCount++] = deadline;
            System.out.println("task added:");
            deadline.printTask();
            System.out.println();
            System.out.println("Now you have " + taskCount + " tasks in the list.");
        }
    }

    public void addTask(Event event) {
        if (taskCount == listSize) {
            System.out.println("max task count reached. Task not added");
        } else {
            tasks[taskCount++] = event;
            System.out.println("task added:");
            event.printTask();
            System.out.println();
            System.out.println("Now you have " + taskCount + " tasks in the list.");
        }
    }

    public int getTaskCount() {
        return taskCount;
    }


    public void printList() {
        for (int i = 0; i < taskCount; i++) {
            tasks[i].printTask();
            System.out.println();
        }

    }

    public void markTaskAsDone(int taskId) {
        if (taskId <= taskCount) { //check if taskId is valid
            if (tasks[taskId-1].getIsDone()) { //check if task is already unmarked
                System.out.println(tasks[taskId].getTaskName() + " was already marked as done");
            } else {
                tasks[taskId - 1].setIsDone(true); //valid and not done, mark as done
                System.out.println(tasks[taskId - 1].getTaskName() + " is marked");
            }
        } else {
            System.out.println("no such task"); //not valid print error
        }
    }

    public void markTaskAsUndone(int taskId) {
        if (taskId <= taskCount) { //check if taskId is valid
            if (!tasks[taskId - 1].getIsDone()) { //check if task is already unmarked
                System.out.println(tasks[taskId - 1].getTaskName() + " was already unmarked");
            } else {
                tasks[taskId - 1].setIsDone(false); //if valid and marked, unmark it
                System.out.println(tasks[taskId - 1].getTaskName() + " is unmarked");
            }
        } else {
            System.out.println("no such task"); //not valid print error
        }
    }

    public void renameTask(int taskID, String newTaskName) {
        if (taskID < taskCount) { //check if taskId valid
            if (tasks[taskID - 1].getTaskName().equals(newTaskName)) { //check if name is same
                System.out.println("please use a new name"); //if no change in name then print error
            } else {
                tasks[taskID - 1].setTaskName(newTaskName); //valid and name not same, change name
            }
        }
    }
}
