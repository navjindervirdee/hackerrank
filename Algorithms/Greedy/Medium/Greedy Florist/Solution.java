import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
        int round = 0;
        long cost = 0;
        Arrays.sort(c);
        while(n>0){
            int temp = k;
            while(n>0 && temp>0){
                cost = (round+1)*c[n-1] + cost;
                temp--;
                n--;
            }
            round++;
        }
        return (int)cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}