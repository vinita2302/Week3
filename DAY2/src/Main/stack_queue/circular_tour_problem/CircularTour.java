package Main.stack_queue.circular_tour_problem;


import java.util.*;
public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, end = 0, currentPetrol = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (queue.size() < pumps.length) {
            currentPetrol += pumps[end].petrol - pumps[end].distance;
            queue.add(end);
            end = (end + 1) % pumps.length;

            while (currentPetrol < 0 && !queue.isEmpty()) {
                start = queue.poll();
                currentPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % pumps.length;
            }
        }

        return queue.size() == pumps.length ? start : -1;
    }
}
