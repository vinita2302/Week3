package Main.circular_linked_list.task_schedular;


import java.util.Date;

class TaskScheduler {
    Task head = null;

    // Add task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, Date dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; //head->newTask->head
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
            head = newTask;
        }
    }

    // Add task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, Date dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, Date dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null || position == 0) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp.next == head) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        Task temp = head;
        Task prev = null;
        do {
            if (temp.taskId == taskId) {
                if (prev == null) {
                    // If the task to be removed is the head
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head.next == head) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found.");
    }

    // View temp task and move to the next task
    public void viewtempAndMoveNext() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Task temp = head;
        System.out.println("temp Task: " + temp.taskName);
        head = temp.next;
    }

    // Display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for tasks by priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task found: " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}

