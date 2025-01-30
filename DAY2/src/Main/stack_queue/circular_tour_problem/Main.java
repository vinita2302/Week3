package Main.stack_queue.circular_tour_problem;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = CircularTour.findStartingPoint(pumps);
        System.out.println(start == -1 ? "No solution" : "Start at pump: " + start);
    }
}