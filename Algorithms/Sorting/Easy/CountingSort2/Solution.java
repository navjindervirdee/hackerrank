import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        int [] count = new int[100];
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            array[i] = num;
            count[num]++;
        }
        
        int j = array.length-1;
        for(int i=count.length-1;i>-1;i--){
            while(count[i]>0){
                array[j] = i;
                j--;
                count[i]--;
            }
        }
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}