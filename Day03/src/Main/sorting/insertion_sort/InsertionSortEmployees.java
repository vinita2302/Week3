package Main.sorting.insertion_sort;
import java.util.Arrays;

public class InsertionSortEmployees {

    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j = j - 1;
            }
            employeeIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {1023, 1001, 1045, 1032, 1015};

        System.out.println("Unsorted Employee IDs: " + Arrays.toString(employeeIds));

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIds));
    }
}
