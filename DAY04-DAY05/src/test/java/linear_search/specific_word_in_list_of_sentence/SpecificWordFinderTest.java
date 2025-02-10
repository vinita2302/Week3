package linear_search.specific_word_in_list_of_sentence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class SpecificWordFinderTest {

    @Test
    void testSpecificWordInListOfSentence() {
        // arrange
        ArrayList<String> sentences1 = new ArrayList<>();
        sentences1.add("This is a test sentence.");
        sentences1.add("Another test sentence here.");
        sentences1.add("No word match in this sentence.");

        ArrayList<String> sentences2 = new ArrayList<>();
        sentences2.add("Hello world");
        sentences2.add("Test case");

        ArrayList<String> sentences3 = new ArrayList<>();
        sentences3.add("Find the word.");
        sentences3.add("Search the word in all sentences.");

        // act
        String result1 = SpecificWordFinder.getSpecificWordInListOfSentence(sentences1, "test");
        String result2 = SpecificWordFinder.getSpecificWordInListOfSentence(sentences2, "case");
        String result3 = SpecificWordFinder.getSpecificWordInListOfSentence(sentences3, "word");
        String result4 = SpecificWordFinder.getSpecificWordInListOfSentence(sentences1, "missing");

        // assert
        Assertions.assertEquals("This is a test sentence.", result1);
        Assertions.assertEquals("Test case", result2);
        Assertions.assertEquals("Find the word.", result3);
        Assertions.assertEquals("Not Found", result4);
    }
}