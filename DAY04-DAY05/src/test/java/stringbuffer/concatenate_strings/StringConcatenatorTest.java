package stringbuffer.concatenate_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.concatenate_string.StringConcatenator;

import java.util.ArrayList;

public class StringConcatenatorTest {

    @Test
    void testConcatenateArrayStrings() {
        // arrange
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(" ");
        strings.add("World");

        StringBuffer strBuffer = new StringBuffer();

        // act
        String result = StringConcatenator.concatenateArrayStrings(strings, strBuffer);

        // assert
        Assertions.assertEquals("Hello World", result);
    }
}
