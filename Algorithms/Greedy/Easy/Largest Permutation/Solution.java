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
        int [] index = new int[n+1];
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
            index[array[i]] = i;
        }
        
        for(int i=0;i<array.length;i++){
            if(k<=0){
                break;
            }
            if(array[i] == n-i){
                continue;
            }
            array[index[n-i]] = array[i];
            index[array[i]] = index[n-i];
            array[i] = n-i;
            index[n-i] = i; 
            k--;
        }
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}