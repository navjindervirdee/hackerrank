import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int n = input.nextInt();
            long [] b = new long[n];
            for(int i=0;i<n;i++){
                b[i] = input.nextInt();
            }
            
            long costL = 0;     //cost ending with lower bound.
            long costH = 0;     //cost ending with higher bound.
            long finalCost = 0; //total final cost.
            
            for(int i=1;i<n;i++){
                long lowdiff =  Math.max((costL+0),(costH+Math.abs(b[i-1]-1)));
                long highdiff = Math.max((costL+Math.abs(1-b[i])),(costH+Math.abs(b[i-1]-b[i])));
                finalCost = Math.max(lowdiff,highdiff);
                costL = lowdiff;
                costH = highdiff;
            }
            System.out.println(finalCost);
        }
    }
}
