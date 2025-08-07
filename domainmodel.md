## Core Requirements Domain Model

### 1. I want to add tasks to my todo list.

| Class    | Instance Variables               | Methods                     | Scenario                          | Output |
| -------- | -------------------------------- | --------------------------- | --------------------------------- | ------ |
| TodoList | List<Task> tasks                 | addTask(Task task): boolean | task.name does not exist in tasks | true   |
|          |                                  |                             | task.name already exists in tasks | false  |
| Task     | String name<br>boolean completed |                             |                                   |        |


### 2. I want to see all the tasks in my todo list.

| Class    | Instance Variables | Methods                   | Scenario                       | Output               |
| -------- | ------------------ | ------------------------- | ------------------------------ | -------------------- |
| TodoList | List<Task> tasks   | getAllTasks(): List<Task> | tasks contains at least 1 task | list of task objects |
|          |                    |                           | tasks is empty or null         | null                 |


### 3. I want to change the status of a task between incomplete and complete.

| Class    | Instance Variables | Methods                            | Scenario                                                        | Output |
| -------- | ------------------ | ---------------------------------- | --------------------------------------------------------------- | ------ |
| TodoList | List<Task> tasks   | toggleStatus(String name): boolean | tasks contains a Task with name = "X"                           | true   |
|          |                    |                                    | tasks is empty or tasks does not contain a Task with name = "X" | false  |


### 4. I want to be able to get only the complete tasks.

| Class    | Instance Variables | Methods                        | Scenario                                                 | Output                  |
| -------- | ------------------ | ------------------------------ | -------------------------------------------------------- | ----------------------- |
| TodoList | List<Task> tasks   | getCompleteTasks(): List<Task> | tasks contains at least one Task where completed == true | list of completed tasks |
|          |                    |                                | tasks is empty or no Task is completed                   | empty list or null      |


### 5. I want to be able to get only the incomplete tasks.

| Class    | Instance Variables | Methods                          | Scenario                                                  | Output                   |
| -------- | ------------------ | -------------------------------- | --------------------------------------------------------- | ------------------------ |
| TodoList | List<Task> tasks   | getIncompleteTasks(): List<Task> | tasks contains at least one Task where completed == false | list of incomplete tasks |
|          |                    |                                  | tasks is empty or all Tasks are completed                 | empty list or null       |


### 6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.

| Class    | Instance Variables | Methods                       | Scenario                                            | Output           |
| -------- | ------------------ | ----------------------------- | --------------------------------------------------- | ---------------- |
| TodoList | List<Task> tasks   | findTask(String name): String | tasks contains a Task with name = "X"               | task name        |
|          |                    |                               | tasks is empty or does not contain a Task with name | "Task not found" |


### 7. I want to remove tasks from my list.

| Class    | Instance Variables | Methods                          | Scenario                                            | Output |
| -------- | ------------------ | -------------------------------- | --------------------------------------------------- | ------ |
| TodoList | List<Task> tasks   | removeTask(String name): boolean | tasks contains a Task with name = "X"               | true   |
|          |                    |                                  | tasks is empty or does not contain a Task with name | false  |


### 8. I want to see all the tasks in my list ordered alphabetically in ascending order.

| Class    | Instance Variables | Methods                         | Scenario                      | Output          |
| -------- | ------------------ | ------------------------------- | ----------------------------- | --------------- |
| TodoList | List<Task> tasks   | getTasksAscending(): List<Task> | tasks contains multiple tasks | list sorted A-Z |


### 9. I want to see all the tasks in my list ordered alphabetically in descending order.

| Class    | Instance Variables | Methods                          | Scenario                      | Output          |
| -------- | ------------------ | -------------------------------- | ----------------------------- | --------------- |
| TodoList | List<Task> tasks   | getTasksDescending(): List<Task> | tasks contains multiple tasks | list sorted Z-A |


