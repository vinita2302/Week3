package Main.sorting.marge_sort;

import java.util.Arrays;

public class BookstoreMergeSort {

    public static void merge(double[] prices, int start, int mid, int end) {
        double[] merged = new double[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (prices[idx1] <= prices[idx2]) {
                merged[x++] = prices[idx1++];
            } else {
                merged[x++] = prices[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = prices[idx1++];
        }
        while (idx2 <= end) {
            merged[x++] = prices[idx2++];
        }

        for (int i = 0; i < merged.length; i++) {
            prices[start + i] = merged[i];
        }
    }

    public static void divide(double prices[], int start, int end) {
        if (start >= end) { // Base case
            return;
        }
        int mid = start + (end - start) / 2;
        divide(prices, start, mid);
        divide(prices, mid + 1, end);
        merge(prices, start, mid, end);
    }

    public static void main(String[] args) {
        double prices[] = { 499.99, 299.99, 599.49, 150.75, 250.00, 399.90 };

        System.out.println("Before Sorting: " + Arrays.toString(prices));
        divide(prices, 0, prices.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(prices));
    }
}

