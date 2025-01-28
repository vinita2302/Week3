package Main.circular_linked_list.round_robin_scheduling_algo;
class Process {
    int processId;
    int burstTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

