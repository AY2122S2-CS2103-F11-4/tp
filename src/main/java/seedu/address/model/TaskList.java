package seedu.address.model;

import java.util.ArrayList;

import seedu.address.model.task.Task;

public class TaskList {
    private final ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public ArrayList<Task> getTaskList() {
        return this.taskList;
    }
}
