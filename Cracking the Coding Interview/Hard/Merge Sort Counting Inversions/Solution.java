import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long count;
    static int [] mergeSort(int [] arr, int low, int high){
        if(low==high){
            int [] array = new int[1];
            array[0] = arr[low];
            return array;
        }
        
        int mid = low + (high-low)/2;
        int [] array1 = mergeSort(arr,low, mid);
        int [] array2 = mergeSort(arr,mid+1,high);
        int [] sorted = combine(array1,array2);
        return sorted;
    }
    
    static int [] combine(int [] array1, int [] array2){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] sorted = new int[array1.length+array2.length];
        
        while(i<array1.length && j<array2.length){
            if(array1[i]>array2[j]){
                count += array1.length-i;
                sorted[k] = array2[j];
                k++;
                j++;
                continue;
            }
            if(array2[j]>=array1[i]){
                sorted[k] = array1[i];
                k++;
                i++;
                continue;
            }
        }
        
        if(i==array1.length){
            while(j<array2.length){
                sorted[k] = array2[j];
                k++;
                j++;
            }
        }
        else{
            while(i<array1.length){
                sorted[k] = array1[i];
                i++;
                k++;
            }
        }
        return sorted;
    }

    static long countInversions(int [] arr) {
        count = 0;
        mergeSort(arr,0,arr.length-1);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }
}
