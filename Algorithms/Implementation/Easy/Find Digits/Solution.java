import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int getCount(int n){
        String num = Integer.toString(n);
        int count = 0;
        for(int i=0;i<num.length();i++){
            int digit = Integer.parseInt(Character.toString(num.charAt(i)));
            if(digit==0){
                continue;
            }
            if(n%digit==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = getCount(n);
            System.out.println(count);
        }
    }
}
