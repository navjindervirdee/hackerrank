import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int calDiff(int [][] a){
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i=0;i<a.length;i++){
            diagonal1 = diagonal1 + a[i][i];
            diagonal2 = diagonal2 + a[i][a.length-1-i];
        }
        return Math.abs(diagonal1-diagonal2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int diff = calDiff(a);
        System.out.println(diff);
    }
}
