package binary_search.rotation_point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotationPointFinderTest {

    @Test
    void test1() {
        // arrange
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        // act
        int index = RotationPointFinder.getIndexOfSmallestElementInRotatedSortedArray(arr);

        // assert
        Assertions.assertEquals(4, index);
    }

    @Test
    void test2() {
        // arrange
        int[] arr = {30, 40, 50, 10, 20};

        // act
        int index = RotationPointFinder.getIndexOfSmallestElementInRotatedSortedArray(arr);

        // assert
        Assertions.assertEquals(3, index);
    }

    @Test
    void test3() {
        // arrange
        int[] arr = {2, 3, 4, 5, 6, 7, 1};

        // act
        int index = RotationPointFinder.getIndexOfSmallestElementInRotatedSortedArray(arr);

        // assert
        Assertions.assertEquals(6, index);
    }
}