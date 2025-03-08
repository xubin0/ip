package commands;

import exception.XbException;
import task.TaskList;
import util.IntegerChecker;

public class UnmarkCommand implements Command {
    @Override
    public void execute(String parts, TaskList taskList) {
        try{
        if (IntegerChecker.isInteger(parts)) {
            taskList.markTaskAsUndone(Integer.parseInt(parts));
        }else{
        throw XbException.invalidUnmarkCommand();
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
