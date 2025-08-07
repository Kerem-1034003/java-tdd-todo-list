## Core Requirements Domain Model

### 1. I want to add tasks to my todo list.

| Class    | Instantievariabelen              | Methoden                    | Scenario                          | Output |
| -------- | -------------------------------- | --------------------------- | --------------------------------- | ------ |
| TodoList | List<Task> tasks                 | addTask(Task task): boolean | Task with name doesn't exist  | true   |
|          |                                  |                             | Task with name already exists | false  |
| Task     | String name<br>boolean completed |                             |                                   |        |

### 2. I want to see all the tasks in my todo list.

| Class    | Instantievariabelen | Methoden                  | Scenario              | Output               |
| -------- | ------------------- | ------------------------- |-----------------------|----------------------|
| TodoList | List<Task> tasks    | getAllTasks(): List<Task> | atleast 1 task exists | list of task objects |

### 3. I want to change the status of a task between incomplete and complete.

| Class    | Instantievariabelen | Methoden                           | Scenario           | Output |
| -------- | ------------------- | ---------------------------------- |--------------------| ------ |
| TodoList | List<Task> tasks    | toggleStatus(String name): boolean | task exist         | true   |
|          |                     |                                    | task doesn't exist | false  |

### 4. I want to be able to get only the complete tasks.

| Class    | Instantievariabelen | Methoden                       | Scenario                       | Output                    |
| -------- | ------------------- | ------------------------------ | ------------------------------ | ------------------------- |
| TodoList | List<Task> tasks    | getCompleteTasks(): List<Task> | Task list contains completed tasks | List of completed tasks |

### 5. I want to be able to get only the incomplete tasks.

| Class    | Instantievariabelen | Methoden                         | Scenario                         | Output                      |
| -------- | ------------------- | -------------------------------- | -------------------------------- | --------------------------- |
| TodoList | List<Task> tasks    | getIncompleteTasks(): List<Task> | Task list contains incomplete tasks | List of incomplete tasks |

### 6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.

| Class    | Instantievariabelen | Methoden                      | Scenario           | Output |
| -------- | ------------------- | ----------------------------- |--------------------|  |
| TodoList | List<Task> tasks    | findTask(String name): String | task exist         | task name |
|          |                     |                               | Task doesn't exist | "Task not found" |

### 7. I want to remove tasks from my list.

| Class    | Instantievariabelen | Methoden                         | Scenario          | Output |
| -------- | ------------------- | -------------------------------- |-------------------| ------ |
| TodoList | List<Task> tasks    | removeTask(String name): boolean | Task exist        | true   |
|          |                     |                                  | Task doesnt exist | false  |

### 8. I want to see all the tasks in my list ordered alphabetically in ascending order.

| Class    | Instantievariabelen | Methoden                        | Scenario       | Output               |
| -------- | ------------------- | ------------------------------- | -------------- | -------------------- |
| TodoList | List<Task> tasks    | getTasksAscending(): List<Task> | Multiple tasks| List sorted A-Z |

### 9. I want to see all the tasks in my list ordered alphabetically in descending order.

| Class    | Instantievariabelen | Methoden                         | Scenario       | Output               |
| -------- | ------------------- | -------------------------------- | -------------- | -------------------- |
| TodoList | List<Task> tasks    | getTasksDescending(): List<Task> | Multiple tasks | List sorted Z-A |
