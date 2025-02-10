package linear_search.specific_word_in_list_of_sentence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpecificWordFinder {

    public static String getSpecificWordInListOfSentence(ArrayList<String> sentences, String searchWord) {
        for (String sentence : sentences) {
            String[] words = sentence.split("\\W+"); // Splitting correctly to avoid punctuation issues
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    return sentence; // Return the first matching sentence
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numberOfSentences = 0;

        // Ensure valid integer input
        while (true) {
            try {
                System.out.print("Enter the number of sentences you want to enter: ");
                numberOfSentences = Integer.parseInt(sc.nextLine().trim()); // Read full line and parse
                if (numberOfSentences <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                break; // Valid input, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        ArrayList<String> sentences = new ArrayList<>();
        for (int i = 0; i < numberOfSentences; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences.add(sc.nextLine().trim());
        }

        System.out.print("Enter the word you want to search: ");
        String word = sc.next().trim();

        System.out.println(getSpecificWordInListOfSentence(sentences, word));

        sc.close(); // Close scanner to prevent resource leaks
    }
}
