import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i==k){
                continue;
            }
            sum = sum + ar[i];
        }
        int half = sum/2;
        return half;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result == b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.print(b-result);
        }
    }
}
