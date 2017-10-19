import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int d = input.nextInt();
        int [] array = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        
        for(int i=0;i<n-3+1;i++){
            int diff1 = array[i] + d;
            int j = i+1;
            while(j<n && array[j]<=diff1){
                if(array[j]==diff1){
                    break;
                }
                j++;
            }
            if(j>=n || array[j]-array[i]!=d){
                continue;
            }
            int diff2 = array[j] + d;
            int k = j+1;
            while(k<n && array[k]<=diff2){
                if(array[k]==diff2){
                    break;
                }
                k++;
            }
            if(k>=n || array[k]-array[j]!=d){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}