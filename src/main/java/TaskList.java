public class TaskList {
    private static int taskCount;
    private Task[] tasks;

    public TaskList() {
        taskCount = 0;
        tasks = new Task[100];
    }

    public void addTask(String taskName) {
        taskCount++;
        tasks[taskCount - 1] = new Task(taskCount, taskName);
    }

    public void addTask(String taskName, boolean isDone) {
        taskCount++;
        tasks[taskCount - 1] = new Task(taskCount, taskName, isDone);
    }


    public void printList() {
        for (int i = 0; i < taskCount; i++) {
            tasks[i].printTasks();
        }

    }

    public void markTaskAsDone(int taskId) {
        if (taskId < taskCount) {
            if (tasks[taskId].getIsDone()) {
                System.out.println(tasks[taskId].getTaskName() + " was already marked as done");
            } else {
                tasks[taskId - 1].setIsDone(true);
                System.out.println(tasks[taskId - 1].getTaskName() + " is marked");
            }
        } else {
            System.out.println("no such task");
        }
    }

    public void markTaskAsUndone(int taskId) {
        if (taskId < taskCount) {
            if (!tasks[taskId-1].getIsDone()) {
                System.out.println(tasks[taskId-1].getTaskName() + " was already unmarked");
            } else {
                tasks[taskId - 1].setIsDone(false);
                System.out.println(tasks[taskId - 1].getTaskName() + " is unmarked");
            }
        } else {
            System.out.println("no such task");
        }
    }
    public void renameTask(int taskID, String newTaskName) {
        if (taskID < taskCount) {
            if (tasks[taskID - 1].getTaskName().equals(newTaskName)) {
                System.out.println("please use a new name");
            }else{
                tasks[taskID - 1].setTaskName(newTaskName);
            }
        }
    }
}
