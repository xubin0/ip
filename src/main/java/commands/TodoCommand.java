package commands;

import exception.XbException;
import task.TaskList;
import task.Todo;

public class TodoCommand implements Command {

    @Override
    public void execute(String parts, TaskList taskList) {
        try {
            if (!parts.isEmpty()) {
            Todo todo = new Todo(parts, false);
            taskList.addTask(todo);

        }else{
            throw XbException.invalidTodoCommand();}
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
