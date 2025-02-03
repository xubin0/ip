public class Task {
    private int taskId;
    private String taskName;
    private boolean isDone;

    public Task(int taskId, String taskName, boolean done) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isDone = done;
    }

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isDone = false;
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

    public int getTaskId() {
        return taskId;
    }

    public void printTasks() {
        System.out.print(this.getTaskId() + ". ");
        if (this.getIsDone()) {
            System.out.print("[X]"); //task done, print with X
        } else {
            System.out.print("[ ]"); //task not done print without X
        }
        System.out.println(this.getTaskName());
    }
}


