package Main.sorting.heap_sort;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            iterativeHeapify(salaries, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            iterativeHeapify(salaries, i, 0);
        }
    }


    private static void iterativeHeapify(int[] salaries, int n, int i) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && salaries[left] > salaries[largest]) {
                largest = left;
            }

            if (right < n && salaries[right] > salaries[largest]) {
                largest = right;
            }

            if (largest == i) {
                break;
            }

            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            i = largest;
        }
    }


    public static void main(String[] args) {
        int[] salaries = {50000, 70000, 60000, 80000, 40000};

        System.out.println("Original Salaries: " + Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}
