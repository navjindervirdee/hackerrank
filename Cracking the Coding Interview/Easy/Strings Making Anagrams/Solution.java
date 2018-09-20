import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int [] alpha = new int[26];
        char [] array1 = first.trim().toCharArray();
        char [] array2 = second.trim().toCharArray();
        for(int i=0;i<array1.length;i++){
            int val = array1[i] - 'a';
            alpha[val]++;
        }
        
        for(int i=0;i<array2.length;i++){
            int val = array2[i] - 'a';
            alpha[val]--;
        }
        
        int count = 0;
        for(int i=0;i<alpha.length;i++){
            count += Math.abs(alpha[i]);
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
