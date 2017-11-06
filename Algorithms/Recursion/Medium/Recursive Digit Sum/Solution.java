import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static long calSum(String num){
        long sum = 0;
        for(int i=0;i<num.length();i++){
            long digit = Long.parseLong(Character.toString(num.charAt(i)));
            sum = sum + digit;
        }
        return sum;
    }
    
    private static long superDigit(String num){
        if(num.length()==1){
            return Long.parseLong(num);
        }
        long sum = calSum(num);
        return superDigit(Long.toString(sum));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nums = input.nextLine().split(" ");
        long sum = calSum(nums[0])*Long.parseLong(nums[1]);
        sum = superDigit(Long.toString(sum));
        System.out.println(sum);
    }
}