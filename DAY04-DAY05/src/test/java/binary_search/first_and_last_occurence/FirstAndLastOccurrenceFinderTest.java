package binary_search.first_and_last_occurence;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstAndLastOccurrenceFinderTest {

    @Test
    void test1() {
        // arrange
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        // act
        int first = FirstAndLastOccurenceFinder.findFirstOccurrence(arr, target);
        int last = FirstAndLastOccurenceFinder.findLastOccurrence(arr, target);

        // assert
        Assertions.assertEquals(1, first);
        Assertions.assertEquals(3, last);
    }

    @Test
    void test2() {
        // arrange
        int[] arr = {1, 1, 1, 1, 1};
        int target = 1;

        // act
        int first = FirstAndLastOccurenceFinder.findFirstOccurrence(arr, target);
        int last = FirstAndLastOccurenceFinder.findLastOccurrence(arr, target);

        // assert
        Assertions.assertEquals(0, first);
        Assertions.assertEquals(4, last);
    }

    @Test
    void test3() {
        // arrange
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 4;

        // act
        int first = FirstAndLastOccurenceFinder.findFirstOccurrence(arr, target);
        int last = FirstAndLastOccurenceFinder.findLastOccurrence(arr, target);

        // assert
        Assertions.assertEquals(-1, first);
        Assertions.assertEquals(-1, last);
    }
}