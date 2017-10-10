import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        int rightSum = 0;
        int leftSum = 0;
        for(int i=1;i<a.length;i++){
            rightSum = rightSum + a[i];
        }
        
        //check for i=0.
        if(leftSum==rightSum){
            return "YES";
        }
        
        //check for elements from i=1 to i=a.length-2.
        for(int i=1;i<a.length-1;i++){
            rightSum = rightSum - a[i];
            leftSum = leftSum + a[i-1];
            if(leftSum==rightSum){
                return "YES";
            }
        }
        
        //check for i=a.length-1
        leftSum = leftSum + a[a.length-1];
        rightSum = 0;
        if(leftSum==rightSum){
            return "YES";
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
