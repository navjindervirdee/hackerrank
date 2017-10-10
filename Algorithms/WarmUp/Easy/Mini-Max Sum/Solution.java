import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int [] sort(int [] array){ 
        for(int i=0;i<array.length-1;i++){
            int min = array[i];
            int index =i;
            for(int j=i;j<array.length;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        arr = sort(arr);
        long min = 0;
        for(int i=0;i<arr.length-1;i++){
            min = min + arr[i];
        }
        long max=0;
        for(int i=1;i<arr.length;i++){
            max = max + arr[i];
        }
        System.out.println(min + " " + max);
    }
}
