package command;

import task.TaskList;

public class CommandHandler {
    private TaskList taskList;

    public CommandHandler(TaskList taskList) {
        this.taskList = taskList;
    }

    public boolean runCommand(String[] parts) {

        CommandList command = CommandList.valueOf(parts[0].toUpperCase());
        command.execute(parts, taskList);
        return !command.equals(CommandList.BYE);
    }

}

