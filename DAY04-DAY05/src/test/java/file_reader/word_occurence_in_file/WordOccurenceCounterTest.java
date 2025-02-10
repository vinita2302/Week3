package file_reader.word_occurence_in_file;


import filereader_problem.count_word_occurence_in_file.WordOccurenceCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordOccurenceCounterTest {

    @Test
    void test1() {
        // arrange
        StringBuilder data = new StringBuilder("a quick brown fox jumps over a lazy dog a");

        // act
        int result = WordOccurenceCounter.countWordOccurence(data, "a");

        // assert
        Assertions.assertEquals(3, result);
    }

    @Test
    void test2() {
        // arrange
        StringBuilder data = new StringBuilder("hello world hello hello world");

        // act
        int result = WordOccurenceCounter.countWordOccurence(data, "hello");

        // assert
        Assertions.assertEquals(3, result);
    }

    @Test
    void test3() {
        // arrange
        StringBuilder data = new StringBuilder("this is a test string for counting words");

        // act
        int result = WordOccurenceCounter.countWordOccurence(data, "missing");

        // assert
        Assertions.assertEquals(0, result);
    }
}