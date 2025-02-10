package linear_search.first_negative_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNegativeNumberFinderTest {

    @Test
    void testFirstNegativeNumber() {
        // arrange
        int[] arr1 = {1, 2, 3, -4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {-1, 2, 3, 4, 5};

        // act
        int result1 = FirstNegativeNumberFinder.getFirstNegativeNumber(arr1);
        int result2 = FirstNegativeNumberFinder.getFirstNegativeNumber(arr2);
        int result3 = FirstNegativeNumberFinder.getFirstNegativeNumber(arr3);

        // assert
        Assertions.assertEquals(3, result1);
        Assertions.assertEquals(-1, result2);
        Assertions.assertEquals(0, result3);
    }
}