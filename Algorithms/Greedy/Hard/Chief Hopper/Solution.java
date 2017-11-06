import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double [] heights = new double[n];
        for(int i=0;i<n;i++){
            heights[i] = input.nextInt();
        }
        
        double energy = 0;
        for(int i=n-1;i>-1;i--){
            energy = Math.ceil((energy+heights[i])/2);
        }
        System.out.println((int)energy);
        
    }
}