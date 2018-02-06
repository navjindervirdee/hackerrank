import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c = 0;c<t;c++){
            long k = input.nextInt();
            long max = 0;
            long j = k;
            long i = 0;
            while(i<=j){
                if(j+i==k){
                    if(max<i*j){
                        max = i*j;
                    }
                }
                i++;
                j--;
            }
            System.out.println(max);
        }
    }
}