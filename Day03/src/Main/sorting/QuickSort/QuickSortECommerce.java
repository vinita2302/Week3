package Main.sorting.QuickSort;

import java.util.Arrays;

public class QuickSortECommerce {


    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        i++;
        int temp = prices[i];
        prices[i] = prices[high];
        prices[high] = temp;
        return i;
    }

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] productPrices = {199, 499, 99, 399, 149, 799, 249, 349};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
