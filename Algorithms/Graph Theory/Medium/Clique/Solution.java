import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            double n = input.nextInt();
            double m = input.nextInt();
            
            double result = -1;

            double lb = 0;
            double ub = n;
            
            double prev = -1;
            while(lb<ub){
                double i = (int)(lb + (int)((ub-lb)/2));
                if(i==prev){
                    break;
                }
                prev = i;
                double edges = 0.5*((n*n) - ((n%i)*Math.pow(Math.ceil(n/i),2)) - ((i-(n%i))*Math.pow(Math.floor(n/i),2)));
                if(m>edges){
                    if(i+1>result){
                        result = i+1;
                    }
                    lb = i;
                    continue;
                }
                ub = i;
            }
            System.out.println((int)result);
        }
    }
}