package Main.circular_linked_list.task_schedular;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks
        scheduler.addTaskAtBeginning(1, "Task 1", 2, new Date());
        scheduler.addTaskAtEnd(2, "Task 2", 1, new Date());
        scheduler.addTaskAtEnd(3, "Task 3", 3, new Date());

        // Display tasks
        scheduler.displayAllTasks();

        // View temp task and move to next
        scheduler.viewtempAndMoveNext();

        // Search for task by priority
        scheduler.searchTaskByPriority(1);

        // Remove task by Task ID
        scheduler.removeTaskById(2);

        // Display tasks after removal
        scheduler.displayAllTasks();
    }
}