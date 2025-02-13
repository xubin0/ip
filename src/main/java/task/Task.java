package task;

public class Task {
    private final int taskId;
    private TaskType taskType;
    private String taskName;
    private boolean isDone;

    public Task(int taskId, String taskName, boolean done) {
        this.taskId = taskId;
        taskType = TaskType.TASK;
        this.taskName = taskName;
        this.isDone = done;
    }

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        taskType = TaskType.TASK;
        this.taskName = taskName;
        this.isDone = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
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

    public void printTask() {
        System.out.print(this.getTaskId() + ". ");
        printTaskType();
        printIsDone();
        System.out.print(this.getTaskName());
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


