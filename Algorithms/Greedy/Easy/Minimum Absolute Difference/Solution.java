import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        Collections.sort(list);
        long min = 100000000;
        for(int i=0;i<list.size()-1;i++){
            long diff = Math.abs(list.get(i)-list.get(i+1));
            if(diff<min){
                min = diff;
            }
        }
        return (int)min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
