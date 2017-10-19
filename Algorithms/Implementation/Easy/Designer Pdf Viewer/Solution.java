import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max = -1;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int ascii = ((int)c) - 97;
            if(max<h[ascii]){
                max = h[ascii];
            }
        }
        System.out.println(max*word.length());
    }
}
