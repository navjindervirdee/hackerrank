import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static long countA(String s, long len){
        long count = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long count = 0;
        long len = s.length();
        if(n<len){
            len = n;
            count = count + countA(s,len);
            System.out.println(count);
        }
        else{
            long rem = n%len;
            long div = (n/len);
            count = count + countA(s,len);
            count = count*div + countA(s,rem);
            System.out.println(count);
        }
    }
}
