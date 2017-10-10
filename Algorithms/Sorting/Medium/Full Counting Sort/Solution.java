import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static String [] countingSort(int [] values, int [] count,String [] strings){
        count[0] = count[0]-1;
        for(int i=1;i<count.length;i++){
            count[i] = count[i-1] + count[i];
        }
        
        String [] sorted = new String[values.length];
        int mid = values.length/2;
        
        for(int i=values.length-1;i>=mid;i--){
            int value = values[i];
            int pos  = count[value];
            count[value]--;
            sorted[pos] = strings[i];
        }
        return sorted;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        int [] values = new int[n];
        String [] strings = new String[n];
        int [] count = new int[100];
        int mid = n/2;
        for(int i=0;i<n;i++){
            String [] str = input.nextLine().trim().split(" ");
            String s = str[1];
            int num = Integer.parseInt(str[0]);
            values[i] = num;
            strings[i] = s;
            count[num]++;
        }
        
        String [] sorted = countingSort(values,count,strings);
        
        for(int i=0;i<sorted.length;i++){
            if(sorted[i]==null){
                System.out.print("- ");
            }
            else{
                System.out.print(sorted[i] + " ");
            }
        }
        System.out.println();
    }
}