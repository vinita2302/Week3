package binary_search.peak_element_in_array;


import java.util.Scanner;

public class PeakElementFinder {

    public static int getPeakElementIndex(int[] arr){
        int s = 0, e = arr.length - 1;
        while (s < e){
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m] < arr[m - 1]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter value of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int peakElementIndex = getPeakElementIndex(arr);
        if (peakElementIndex == -1) System.out.println("No peak element found!");
        else System.out.println("Peak element's index "+peakElementIndex+" its value "+arr[peakElementIndex]);

    }
}