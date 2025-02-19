package task;

import java.util.ArrayList;

public class TaskList {
    private int taskCount;
    private ArrayList<Task> tasks;

    public TaskList() {
        taskCount = 0;
        tasks = new ArrayList<>();
    }


    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("task added:");
        task.printTask();
        System.out.println();
        System.out.println("Now you have " + ++taskCount + " tasks in the list.");

    }

    public void addTask(Todo todo) {
        tasks.add(todo);
        System.out.println("task added:");
        todo.printTask();
        System.out.println();
        System.out.println("Now you have " + ++taskCount + " tasks in the list.");
    }


    public void addTask(Deadline deadline) {
        tasks.add(deadline);
        System.out.println("task added:");
        deadline.printTask();
        System.out.println();
        System.out.println("Now you have " + ++taskCount + " tasks in the list.");
    }

    public void addTask(Event event) {
        tasks.add(event);
        System.out.println("task added:");
        event.printTask();
        System.out.println();
        System.out.println("Now you have " + ++taskCount + " tasks in the list.");
    }

    public int getTaskCount() {
        return taskCount;
    }


    public void printList() {
        for (int i = 0; i < taskCount; i++) {
            tasks.get(i).printTask();
            System.out.println();
        }

    }

    public void markTaskAsDone(int taskId) {
        if (taskId <= taskCount) { //check if taskId is valid
            if (tasks.get(taskId-1).getIsDone()) { //check if task is already unmarked
                System.out.println(tasks.get(taskId-1).getTaskName() + " was already marked as done");
            } else {
                tasks.get(taskId-1).setIsDone(true); //valid and not done, mark as done
                System.out.println(tasks.get(taskId-1).getTaskName() + " is marked");
            }
        } else {
            System.out.println("no such task"); //not valid print error
        }
    }

    public void markTaskAsUndone(int taskId) {
        if (taskId <= taskCount) { //check if taskId is valid
            if (!tasks.get(taskId-1).getIsDone()) { //check if task is already unmarked
                System.out.println(tasks.get(taskId-1).getTaskName() + " was already unmarked");
            } else {
                tasks.get(taskId-1).setIsDone(false); //if valid and marked, unmark it
                System.out.println(tasks.get(taskId-1).getTaskName() + " is unmarked");
            }
        } else {
            System.out.println("no such task"); //not valid print error
        }
    }

    public void renameTask(int taskId, String newTaskName) {
        if (taskId < taskCount) { //check if taskId valid
            if (tasks.get(taskId-1).getTaskName().equals(newTaskName)) { //check if name is same
                System.out.println("please use a new name"); //if no change in name then print error
            } else {
                tasks.get(taskId-1).setTaskName(newTaskName); //valid and name not same, change name
            }
        }
    }
}
