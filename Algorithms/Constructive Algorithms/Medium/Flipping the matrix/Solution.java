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
            int n = input.nextInt();
            long [][] mat = new long[2*n][2*n];
            for(int i=0;i<2*n;i++){
                for(int j = 0;j<2*n;j++){
                    mat[i][j] = input.nextInt();
                }
            }
            long sum = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum = sum + Math.max(Math.max(mat[i][j],mat[i][2*n-1-j]),Math.max(mat[2*n-1-i][j],mat[2*n-1-i][2*n-1-j]));
                }
            }
            System.out.println(sum);
        }
    }
}