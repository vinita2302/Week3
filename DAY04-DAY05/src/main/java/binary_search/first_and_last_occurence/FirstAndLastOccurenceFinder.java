package binary_search.first_and_last_occurence;

import java.io.IOException;
import java.util.Scanner;

public class FirstAndLastOccurenceFinder {

    public static int findFirstOccurrence(int[] arr, int target) {
        int s = 0, e = arr.length - 1, first = -1;
        while (s <= e) {
            int m = s + ((e - s) / 2);
            if (arr[m] == target) {
                first = m;
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return first;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int s = 0, e = arr.length - 1, last = -1;
        while (s <= e) {
            int m = s + ((e - s) / 2);
            if (arr[m] == target) {
                last = m;
                s = m + 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter sorted array values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int firstOccurrence = findFirstOccurrence(arr, target);
        int lastOccurrence = findLastOccurrence(arr, target);

        if (firstOccurrence == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First occurrence index: " + firstOccurrence);
            System.out.println("Last occurrence index: " + lastOccurrence);
        }
    }
}