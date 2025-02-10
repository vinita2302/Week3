package input_stream_reader.write_to_file;


import java.io.*;

public class FileContentWriter {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string in order to store data in txt file: ");
        StringBuilder sb = new StringBuilder(br.readLine());

        try (FileWriter fw = new FileWriter("src/main/java/input_stream_reader/write_to_file/file.txt")) {
            fw.write(sb.toString());
            System.out.println("Changes made in txt file successfully!");
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }

    }
}