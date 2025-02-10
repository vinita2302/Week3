package linear_search.first_negative_number;


import java.io.IOException;

import java.util.Scanner;

public class FirstNegativeNumberFinder {

    public static int getFirstNegativeNumber(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array for finding first negative number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter value for element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int negativeNumberIndex = getFirstNegativeNumber(arr);
        System.out.println("Index of first negative number is "+negativeNumberIndex+". "+(negativeNumberIndex == -1 ? "" : "Its value is "+arr[negativeNumberIndex]));

    }
}