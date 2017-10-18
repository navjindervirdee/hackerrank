import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int min = 1000000000;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    int diff = Math.abs(i-j);
                    if(min>diff){
                        min = diff;
                    }
                    break;
                }
            }
        }
        if(min==1000000000){
            System.out.println(-1);
        }
        else{
            System.out.println(min);
        }
    }
}
