import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int count = 0;
        
        for(int l=i;l<=j;l++){
            String str = Integer.toString(l);
            String rev = new StringBuilder(str).reverse().toString();
            int s = Integer.parseInt(str);
            int r = Integer.parseInt(rev);
            if(Math.abs(s-r)%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}