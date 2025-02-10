package stringbuffer.concatenate_string;
import java.util.ArrayList;
import java.util.Scanner;

public class StringConcatenator {

    public static String concatenateArrayStrings(ArrayList<String> strings, StringBuffer str){
        for (int i=0; i<strings.size(); i++) str.append(strings.get(i));
        return str.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings you want to enter: ");
        int numberOfStrings = sc.nextInt();
        sc.nextLine();

        ArrayList<String> strings = new ArrayList<>();
        for (int i=0; i<numberOfStrings; i++){
            System.out.print("Enter sentence "+(i+1)+": ");
            String string = sc.nextLine();
            strings.add(string.trim());
        }

        StringBuffer strBuffer = new StringBuffer();

        System.out.println("After Concatenating all the strings together we get: "+concatenateArrayStrings(strings, strBuffer));

    }
}