import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int [] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
        int [] remainders = new int[k];
        for(int i=0;i<n;i++){
            remainders[array[i]%k]++;
        }
        int size = 0;
        for(int i=1;i<=k/2;i++){
            if(remainders[i]!=0 && i==k-i){
                size++;
                continue;
            }
            size = size + Math.max(remainders[i],remainders[k-i]);
        }
        
        if(remainders[0]!=0){
            size++;
        }
        System.out.println(size);
    }
}