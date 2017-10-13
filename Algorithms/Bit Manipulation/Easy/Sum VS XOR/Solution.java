import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String getBinary(long n){
        String binary = "";
        while(n!=0){
            binary = Long.toString(n%2) + binary; 
            n = n/2;
        }
        return binary;
    }

    static long solve(long n) {
        String binary = getBinary(n);
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                count++;
            }
        }
        return (long)Math.pow(2,count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
