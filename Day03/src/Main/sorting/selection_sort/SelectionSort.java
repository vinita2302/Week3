package Main.sorting.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {85, 42, 90, 67, 38, 76, 99};

        System.out.println("Original Scores: " + Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("Sorted Scores: " + Arrays.toString(scores));
    }
}
