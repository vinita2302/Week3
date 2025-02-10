package binary_search.rotation_point;

import java.io.IOException;
import java.util.Scanner;

public class RotationPointFinder {

    public static int getIndexOfSmallestElementInRotatedSortedArray(int[] arr){
        int s=0, e=arr.length-1;
        while (s < e){
            int m = s+((e-s)/2);
            if (arr[m] < arr[e]){
                e = m;
            } else {
                s = m+1;
            }
        }
        return e;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array for rotated sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter value of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int smallestElementIndex = getIndexOfSmallestElementInRotatedSortedArray(arr);
        System.out.println("The index of smallest element in rotated sorted array is "+smallestElementIndex+" i.e., "+arr[smallestElementIndex]);

    }
}