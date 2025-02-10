package stringbuilder_problems.reverse_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReversal {

    public static String reverseString(StringBuilder str){
        return str.reverse().toString();
    }

    public static String reverseString(String str){
        StringBuilder reversedString = new StringBuilder("");
        reversedString.append(str);
        return reversedString.reverse().toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string for reversal: ");
        StringBuilder str = new StringBuilder(br.readLine());
        System.out.println("Before: "+str);
        System.out.println("After: "+reverseString(str));

        br.close();

    }
}
