package binary_search.target_value_in_2d_array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TargetValueFinderIn2dArrrayTest {

    @Test
    void test1() {
        // arrange
        int[][] arr = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        // act
        Pair result = TargetValueFinderIn2dArrray.searchElementIn2dArray(arr, 9);

        // assert
        Assertions.assertEquals(1, result.rowIndex);
        Assertions.assertEquals(1, result.colIndex);
    }

    @Test
    void test2() {
        // arrange
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // act
        Pair result = TargetValueFinderIn2dArrray.searchElementIn2dArray(arr, 60);

        // assert
        Assertions.assertEquals(1, result.rowIndex);
        Assertions.assertEquals(2, result.colIndex);
    }

    @Test
    void test3() {
        // arrange
        int[][] arr = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        // act
        Pair result = TargetValueFinderIn2dArrray.searchElementIn2dArray(arr, 5);

        // assert
        Assertions.assertEquals(-1, result.rowIndex);
        Assertions.assertEquals(-1, result.colIndex);
    }
}
