package Main.circular_linked_list.task_schedular;

import java.util.Date;

class Task {
    int taskId;
    String taskName;
    int priority;
    Date dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, Date dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
