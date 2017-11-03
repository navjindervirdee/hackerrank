import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long candies(int n, int[] arr) {
        long [] leftcandies = new long[n];
        long [] rightcandies = new long[n];
        
        leftcandies[0] = 1;
        rightcandies[n-1] = 1;
        
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                leftcandies[i] = leftcandies[i-1]+1;
                continue;
            }
            leftcandies[i] = 1;
        }
        
        for(int i=n-2;i>-1;i--){
            if(arr[i]>arr[i+1]){
                rightcandies[i] = rightcandies[i+1]+1;
                continue;
            }
            rightcandies[i] = 1;
        }
        
        long sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + Math.max(leftcandies[i],rightcandies[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long result = candies(n, arr);
        System.out.println(result);
        in.close();
    }
}
