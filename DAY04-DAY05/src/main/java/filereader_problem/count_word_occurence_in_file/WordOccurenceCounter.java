package filereader_problem.count_word_occurence_in_file;


import java.io.BufferedReader;
import java.io.FileReader;

public class WordOccurenceCounter {

    public static int countWordOccurence(StringBuilder data, String word){
        int occurenceCount = 0;
        String[] words = data.toString().split(" ");
        for (int i=0; i<words.length; i++){
            if (words[i].equals(word)) occurenceCount++;
        }
        return occurenceCount;
    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/file_reader/count_word_occurrence_in_file/file.txt"))){

            StringBuilder sb = new StringBuilder();

            int character;
            while ((character = br.read()) != -1){
                sb.append((char) character);
            }

            String word = "a";
            int wordOccurence = countWordOccurence(sb, word);
            System.out.println("The word occurence of \""+word+"\" in whole data is "+wordOccurence);


        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}