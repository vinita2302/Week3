package Main.circular_linked_list.round_robin_scheduling_algo;

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int processCount = 0;

    // Add a new process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head; // Circular link
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
        processCount++;
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        Process current = head;
        Process prev = null;

        // Search for the process to remove
        do {
            if (current.processId == processId) {
                if (current == head) { // Removing head
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // Removing tail
                    tail = prev;
                    tail.next = head;
                } else { // Removing a middle node
                    prev.next = current.next;
                }
                processCount--;
                System.out.println("Process " + processId + " removed after execution.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate round-robin scheduling
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int currentTime = 0;

        Process current = head;

        while (processCount > 0) {
            System.out.println("Executing Process ID: " + current.processId);
            if (current.burstTime > timeQuantum) {
                current.burstTime -= timeQuantum;
                currentTime += timeQuantum;
                System.out.println("Process ID: " + current.processId + " remaining burst time: " + current.burstTime);
            } else {
                currentTime += current.burstTime;
                current.turnAroundTime = currentTime;
                current.waitingTime = current.turnAroundTime - (current.burstTime + current.waitingTime);
                totalWaitingTime += current.waitingTime;
                totalTurnAroundTime += current.turnAroundTime;

                int completedProcessId = current.processId;
                current = current.next;
                removeProcess(completedProcessId);
                continue;
            }
            current = current.next;
        }

        double avgWaitingTime = (double) totalWaitingTime / (processCount + 1);
        double avgTurnAroundTime = (double) totalTurnAroundTime / (processCount + 1);

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }

    // Display all processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process current = head;
        System.out.println("Processes in the queue:");
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime +
                    ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}
