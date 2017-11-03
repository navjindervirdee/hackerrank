import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        long sum = 0;
        long ones = 1;
        for(int i=a.length()-1;i>-1;i--){
            sum = (sum + Integer.parseInt(Character.toString(a.charAt(i)))*ones*(i+1))%(1000000000+7);
            ones = (ones*10 + 1)%(1000000000+7);
        }
        System.out.println(sum);
    }
}
