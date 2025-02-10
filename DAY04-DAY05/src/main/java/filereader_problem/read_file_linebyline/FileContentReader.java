package filereader_problem.read_file_linebyline;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileContentReader {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/file_reader/read_file/file.txt"))){

            int character;
            while ((character = br.read()) != -1){
                System.out.print((char) character);
            }

        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }

    }
}