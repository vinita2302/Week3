package binary_search.target_value_in_2d_array;

import java.util.Scanner;

public class TargetValueFinderIn2dArrray {

    public static Pair searchElementIn2dArray(int[][] arr, int search){
        int s = 0, e = (arr.length * arr[0].length) - 1;
        while (s <= e){
            int m = s + (e-s)/2;
            int row = m/arr[0].length, col = m%arr[0].length;
            if (arr[row][col] == search) return new Pair(row, col);
            else if (arr[row][col] > search) e = m-1;
            else s = m+1;
        }
        return new Pair(-1, -1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length of 2D array: ");
        int row = sc.nextInt();
        System.out.print("Enter the column length of 2D array: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter "+(row*col)+" value(s) for array that will be inserted one by one through row and column wise : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number you want to search in the array: ");
        int searchNum = sc.nextInt();

        Pair searchNumIndex = searchElementIn2dArray(arr, searchNum);
        if (searchNumIndex.colIndex == -1 || searchNumIndex.rowIndex == -1) System.out.println("Element not found!");
        else System.out.println("Element was found at row index at "+searchNumIndex.rowIndex+" and column index at "+searchNumIndex.colIndex);

    }
}