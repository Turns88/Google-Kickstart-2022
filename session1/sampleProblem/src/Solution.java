import java.util.*;
import java.io.*;

public class Solution{




    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] candyInBag = new int[n];
            for (int j = 0; j < n; j++){
                candyInBag[j] = in.nextInt();
            }
            // System.out.println(n + " "  + m+  " " + candyInBag.toString());


            int totalCandies = 0;
            int candiesLeftOver;

            for( int o = 0; o < candyInBag.length; o++){
                totalCandies = totalCandies + candyInBag[o];
            }

            candiesLeftOver = totalCandies % m;

            System.out.println("Case #" + i + ": " + candiesLeftOver);
        }
    }

}
