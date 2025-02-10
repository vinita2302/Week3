package binary_search.peak_element_in_array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementFinderTest {

    @Test
    void test1() {
        // arrange
        int[] arr = {1, 3, 5, 7, 4, 2};

        // act
        int peakIndex = PeakElementFinder.getPeakElementIndex(arr);

        // assert
        Assertions.assertTrue(peakIndex == 3);
    }

    @Test
    void test2() {
        // arrange
        int[] arr = {10, 20, 30, 40, 50};

        // act
        int peakIndex = PeakElementFinder.getPeakElementIndex(arr);

        // assert
        Assertions.assertTrue(peakIndex == 4);
    }

    @Test
    void test3() {
        // arrange
        int[] arr = {100, 90, 80, 70, 60};

        // act
        int peakIndex = PeakElementFinder.getPeakElementIndex(arr);

        // assert
        Assertions.assertTrue(peakIndex == 0);
    }
}