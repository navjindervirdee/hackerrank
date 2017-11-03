import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static long maxSubarray(int [] array){
        long max = 0;
        long sum = 0;
        boolean positive =false;
        for(int i=0;i<array.length;i++){
            if(sum+array[i]<0){
                sum=0;
                continue;
            }
            if(max<sum+array[i]){
                max = sum+array[i];
                sum = sum + array[i];
                positive = true;
                continue;
            }
            sum  = sum + array[i];
        }
        if(positive){
            return max;
        }
        long maxnegative = Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            if(maxnegative<array[i]){
                maxnegative = array[i];
            }
        }
        return maxnegative;
    }
    
    private static long maxSubseq(int [] array){
        long sum = 0;
        long maxnegative = Integer.MIN_VALUE;
        boolean positive = false;
        
        for(int i=0;i<array.length;i++){
            if(array[i]>=0){
                sum = array[i] + sum;
                positive = true;
                continue;
            }
            if(maxnegative<array[i]){
                maxnegative = array[i];
            }
        }
        if(!positive){
            return maxnegative;
        }
        return sum;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int n = input.nextInt();
            int [] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = input.nextInt();
            }
            if(n==0){}
            long maxsubarray = maxSubarray(array);
            long maxsubseq = maxSubseq(array);
            System.out.println(maxsubarray + " " + maxsubseq);
        }
    }
}
