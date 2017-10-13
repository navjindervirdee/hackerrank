import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static String getBinary(long num){
        String binary = "";
        while(num!=0){
            long remainder = num%2;
            binary = Long.toString(remainder) + binary;
            num = num/2;
        }
        while(binary.length()!=32){
            binary = "0" + binary;
        }
        return binary;
    }
    
    private static String flipBinary(String binary){
        String flip = "";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                flip = flip + "1";
            }
            else{
                flip = flip + "0";
            }
        }
        return flip;
    }
    
    private static long getNum(String flip){
        long num = 0;
        int j = 31;
        for(int i=0;i<flip.length();i++){
            long power = (long)Math.pow(2,j);
            num = num + power*(Long.parseLong(Character.toString(flip.charAt(i))));
            j--;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int i=0;i<t;i++){
            Long num = Long.parseLong(input.nextLine().trim());
            String binary = getBinary(num);
            String flipped = flipBinary(binary);
            long newnum = getNum(flipped);
            System.out.println(newnum);
        }
    }
}