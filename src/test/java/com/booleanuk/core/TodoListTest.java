package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;



class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskWhenNotExist(){
        TodoList todoList = new TodoList();
        Task task = new Task("do laundry");

        boolean result = todoList.addTask(task);

        Assertions.assertTrue(result);
    }

    @Test
    public void addTaskWhenAlreadyExists() {
        TodoList todoList = new TodoList();
        Task task = new Task("Do laundry");

        todoList.addTask(task);
        boolean result = todoList.addTask(task);

        Assertions.assertFalse(result);
    }

    @Test
    public void testgetAllTasks(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Do dishes");
        Task task3 = new Task("Walk the dog");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        List<Task> tasks = todoList.getAllTasks();

        Assertions.assertEquals(3,tasks.size());
        Assertions.assertTrue(tasks.contains(task1));
        Assertions.assertTrue(tasks.contains(task2));
        Assertions.assertTrue(tasks.contains(task3));
    }

    @Test
    public void testToggleStatus(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Walk the dog");

        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean toggledExisting = todoList.toggleStatus("Buy groceries");
        Assertions.assertTrue(toggledExisting);

        boolean toggledNonExisting = todoList.toggleStatus("Walk the dog");
        Assertions.assertTrue(toggledNonExisting);

    }

}
