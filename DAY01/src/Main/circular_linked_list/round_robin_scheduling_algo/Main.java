package Main.circular_linked_list.round_robin_scheduling_algo;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Adding processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);

        // Display processes
        scheduler.displayProcesses();

        // Simulate round-robin scheduling
        System.out.println("Starting Round-Robin Simulation with Time Quantum = 3");
        scheduler.simulate(3);

        // Display processes after simulation
        System.out.println("Processes after simulation:");
        scheduler.displayProcesses();
    }
}

