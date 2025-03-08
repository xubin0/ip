package commands;

import exception.XbException;
import task.TaskList;
import util.IntegerChecker;

public class DeleteCommand implements Command {
    @Override
    public void execute(String parts, TaskList taskList) {
        try{
        if (IntegerChecker.isInteger(parts)) {
            taskList.deleteTask(Integer.parseInt(parts));
        }else{
            throw XbException.invalidDeleteCommand();

        }}catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
