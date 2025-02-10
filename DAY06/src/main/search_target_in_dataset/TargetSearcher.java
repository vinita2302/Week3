package main.search_target_in_dataset;



public class TargetSearcher {

    public static int searchUsingLinearSearch(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int searchUsingBinarySearch(int[] arr, int target){
        int s = 0, e = arr.length - 1;
        while (s<=e){
            int m=s+(e-s)/2;
            if (arr[m] == target) return m;
            else if (arr[m] < target){
                s = m+1;
            } else e = m-1;
        }
        return -1;
    }

    public static double calculateLinearSearchTimeUsingDatasetSize(int n){
        int[] arr = new int[n];
        long startTime = System.nanoTime();
        int targetIndex = searchUsingLinearSearch(arr, 10);
        long endTime = System.nanoTime();
        return ((double)endTime-startTime)/1000000;
    }

    public static double calculateBinarySearchTimeUsingDatasetSize(int n){
        int[] arr = new int[n];
        long startTime = System.nanoTime();
        int targetIndex = searchUsingBinarySearch(arr, 10);
        long endTime = System.nanoTime();
        return ((double)endTime-startTime)/1000000;
    }

    public static void main(String[] args) {

        System.out.println("Time took by linear search for 1000 data set is "+calculateLinearSearchTimeUsingDatasetSize(1000)+"ms");

        System.out.println("Time took by binary search for 1000 data set is "+calculateBinarySearchTimeUsingDatasetSize(1000)+"ms");

        System.out.println("Time took by linear search for 10,000 data set is "+calculateLinearSearchTimeUsingDatasetSize(10000)+"ms");

        System.out.println("Time took by binary search for 10,000 data set is "+calculateBinarySearchTimeUsingDatasetSize(10000)+"ms");

        System.out.println("Time took by linear search for 1,000,000 data set is "+calculateLinearSearchTimeUsingDatasetSize(1000000)+"ms");

        System.out.println("Time took by binary search for 1,000,000 data set is "+calculateBinarySearchTimeUsingDatasetSize(1000000)+"ms");

    }
}
