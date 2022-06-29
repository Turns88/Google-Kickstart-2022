import java.util.*;
import java.io.*;
public class Solution {

    public static  boolean isVowel(char currentChar){
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++){
            if(currentChar == vowels[i]){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        String[] Owners = {"Alice", "Bob", "nobody"};

        String Y;
        for (int i = 1; i <= t; ++i) {
            //String randome = in.next();
            String K = in.next();

            char keyChar = K.charAt(K.length()-1);
            if (isVowel(keyChar) == true){
                Y = Owners[0];
            }
            else if (keyChar == 'y' || keyChar == 'Y'){
                Y = Owners[2];
            }
            else{
                Y = Owners[1];
            }
            System.out.println("Case #" + i + ": " + K +" "+ "is ruled by " + Y +".");
        }

    }



}
