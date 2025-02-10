package stringbuilder.reverse_string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilder_problems.reverse_string.StringReversal;

public class StringReversalTest {

    @Test
    void test1() {
        // arrange
        StringBuilder str = new StringBuilder("the man");

        // act
        String reversedString = StringReversal.reverseString(str);

        // assert
        Assertions.assertEquals("nam eht", reversedString);
    }

    @Test
    void test2() {
        // arrange
        StringBuilder str = new StringBuilder("aabbcc");

        // act
        String reversedString = StringReversal.reverseString(str);

        // assert
        Assertions.assertEquals("ccbbaa", reversedString);
    }

}