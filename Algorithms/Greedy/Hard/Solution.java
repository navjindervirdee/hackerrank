import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int c=0;c<q;c++){
            int rows = input.nextInt();
            int cols = input.nextInt();
            
            long [] rowCost = new long[rows-1];
            long [] colCost = new long[cols-1];
            
            for(int i=0;i<rowCost.length;i++){
                rowCost[i] = input.nextInt();
            }
            
            for(int i=0;i<colCost.length;i++){
                colCost[i] = input.nextInt();
            }
            
            Arrays.sort(colCost);
            Arrays.sort(rowCost);
            
            long horSeg = 1;
            long verSeg = 1;
            
            int i = rowCost.length-1;
            int j = colCost.length-1;
            
            long mod = 1000000007;
            
            long cost = 0;
            
            while(i>-1 && j>-1){
                if(rowCost[i]>=colCost[j]){
                    cost = (cost + rowCost[i]*verSeg)%mod;
                    horSeg++;
                    i--;
                }
                else{
                    cost = (cost + colCost[j]*horSeg)%mod;
                    verSeg++;
                    j--;
                }
            }
            
            if(i<0){
                while(j>-1){
                    cost = (cost + colCost[j]*horSeg)%mod;
                    j--;
                }
            }
            else{
                while(i>-1){
                    cost = (cost + rowCost[i]*verSeg)%mod;
                    i--;
                }
            }
            
            System.out.println(cost%mod);
        }
    }
}