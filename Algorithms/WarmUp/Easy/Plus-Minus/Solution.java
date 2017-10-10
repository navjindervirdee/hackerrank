import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static float[] getFractions(int [] arr){
        float [] fractions = new float[3];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                fractions[0]++;
                continue;
            }
            if(arr[i]<0){
                fractions[1]++;
            }
            else{
                fractions[2]++;
            }
        }
        for(int i=0;i<fractions.length;i++){
            fractions[i] = fractions[i]/arr.length;
        }
        return fractions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        float [] fractions = getFractions(arr);
        for(int i=0;i<fractions.length;i++){
            System.out.println(fractions[i]);
        }
    }
}
