package task;

import command.CommandList;

public abstract class Task {
    private CommandList taskType;
    private String taskName;
    private boolean isDone;

    public Task(String taskName, boolean done) {
        this.taskName = taskName;
        this.isDone = done;
    }

    public Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }


    public CommandList getTaskType() {
        return taskType;
    }

    public void setTaskType(CommandList taskType) {
        this.taskType = taskType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }



    public void printIsDone() {
        if (this.isDone) {
            System.out.print("[X]"); //task done, print with X
        } else {
            System.out.print("[ ]"); //task not done print without X
        }
    }

    public  void printTaskType() {
        switch (this.getTaskType()) {
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
    public void printTask(){
        printTaskType();
        printIsDone();
        System.out.print(" "+taskName);
    }
    public void printDue(){
        System.out.println();
    }
    public abstract String toFileFormat();


}


