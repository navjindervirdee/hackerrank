import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        int small = arr[0];
        int left = n;
        while(left>0){
            System.out.println(left);
            int count = 0;
            for(int i=0;i<n;i++){
                arr[i] = arr[i]-small;
                if(arr[i]<=0){
                    count++;
                }
            }
            left = n-count;
            small = arr[count];
        }
    }
}
