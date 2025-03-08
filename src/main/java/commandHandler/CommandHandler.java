package commandHandler;

import commands.ByeCommand;
import commands.Command;
import task.TaskList;

public class CommandHandler {
    private TaskList taskList;
    private Command command;
    private String parts;

    public CommandHandler(TaskList taskList, String[] commands) {
        this.taskList = taskList;
        command= CommandFactory.createCommand(commands[0]);
        parts = commands[1];

    }

    public boolean runCommand() {
        if (command != null) {
            command.execute(parts, taskList);
        }
        return !(command instanceof ByeCommand);
    }
}