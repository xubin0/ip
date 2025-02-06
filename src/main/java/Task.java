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



}


