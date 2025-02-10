package stringbuffer.compare_stringbuffer_with_stringbuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.compare_string.StringBufferWithStringBuilderComparator;

public class StringBufferWithStringBuilderComparatorTest {

    @Test
    void testTimeComparison() {
        // act
        double timeByStringBuilder = StringBufferWithStringBuilderComparator.timeTookToConcatenateByStringBuilder();
        double timeByStringBuffer = StringBufferWithStringBuilderComparator.timeTookToConcatenateByStringBuffer();

        // assert
        Assertions.assertTrue(timeByStringBuilder > 0);
        Assertions.assertTrue(timeByStringBuffer > 0);
        Assertions.assertNotEquals(timeByStringBuilder, timeByStringBuffer);
    }
}