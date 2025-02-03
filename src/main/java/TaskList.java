public class TaskList {
    public static final int MAX_TASK_SIZE = 100;
    private static int taskCount;
    private Task[] tasks;

    public TaskList() {
        taskCount = 0;
        tasks = new Task[MAX_TASK_SIZE];
    }

    public void addTask(String taskName) {
        if (taskCount == MAX_TASK_SIZE) {
            System.out.println("max task count reached. Task not added");
        } else {
            taskCount++;
            tasks[taskCount - 1] = new Task(taskCount, taskName);
        }
    }

    public void addTask(String taskName, boolean isDone) {
        if (taskCount == MAX_TASK_SIZE) {
            System.out.println("max task count reached. Task not added");
        } else {
            taskCount++;
            tasks[taskCount - 1] = new Task(taskCount, taskName, isDone);
        }
    }


    public void printList() {
        for (int i = 0; i < taskCount; i++) {
            tasks[i].printTasks();
        }

    }

    public void markTaskAsDone(int taskId) {
        if (taskId < taskCount) { //check if taskId is valid
            if (tasks[taskId].getIsDone()) { //check if task is already unmarked
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
        if (taskId < taskCount) { //check if taskId is valid
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
