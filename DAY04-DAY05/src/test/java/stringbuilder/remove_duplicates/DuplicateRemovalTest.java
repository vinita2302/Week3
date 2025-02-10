package stringbuilder.remove_duplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilder_problems.remove_duplicate.DuplicateRemoval;

public class DuplicateRemovalTest {

    @Test
    void test1() {
        // arrange
        StringBuilder str = new StringBuilder("the man is running very fast");

        // act
        String stringWithNoDuplicates = DuplicateRemoval.removeDuplicates(String.valueOf(str));

        // assert
        Assertions.assertEquals("the manisrugvyf", stringWithNoDuplicates);
    }

    @Test
    void test2() {
        // arrange
        StringBuilder str = new StringBuilder("qazxswedcvffrtgbnhyujmkiolp");

        // act
        String stringWithNoDuplicates = DuplicateRemoval.removeDuplicates(String.valueOf(str));

        // assert
        Assertions.assertEquals("qazxswedcvfrtgbnhyujmkiolp", stringWithNoDuplicates);
    }

}