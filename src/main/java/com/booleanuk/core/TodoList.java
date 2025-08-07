package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (t.getName().equals(task.getName())) {
                return false;
            }
        }
        tasks. add(task);
        return true;
    }

    public List<Task> getAllTasks(){
        return this.tasks;
    }

    public boolean toggleStatus(String name) {
        for (Task t : tasks) {
            if (t.getName().equals(name)) {
                t.setCompleted(!t.isCompleted());
                return true;
            }
        }
        return false;
    }

}
