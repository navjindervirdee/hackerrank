import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        int m = input.nextInt();
        double c = 0;
        for(int i=0;i<m;i++){
            double a = input.nextInt();
            double b = input.nextInt();
            double k = input.nextInt();
            c += (b-a+1)*k;
        }
        long ans = (long)Math.floor(c/n);
        System.out.println(ans);
    }
}