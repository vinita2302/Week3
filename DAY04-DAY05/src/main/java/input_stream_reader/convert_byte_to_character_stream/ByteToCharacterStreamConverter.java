package input_stream_reader.convert_byte_to_character_stream;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharacterStreamConverter {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/main/java/input_stream_reader/convert_byte_to_character_stream/file.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            int character;
            while ((character = br.read()) != -1){
                System.out.print((char) character);
            }

        } catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }

    }
}