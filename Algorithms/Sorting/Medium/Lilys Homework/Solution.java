import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int solve(int [] array){
        int [] sortedArray = new int[array.length];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
            map.put(array[i],i);
        }
        
        Arrays.sort(sortedArray);
        
        int swaps = 0;
        
        
        for(int i=0;i<array.length;i++){
            int num = array[i];
            if(num==sortedArray[i]){
                continue;
            }
            
            swaps++;
            int index = map.get(sortedArray[i]);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
            map.put(num,index);
        }
        return swaps;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] inputArray = new int[n];
        int [] reverseArray = new int[n];
        
        int j = n-1;
        for(int i=0;i<n;i++){
            inputArray[i] = input.nextInt();
            reverseArray[j] = inputArray[i];
            j--;
        }
        
        int swaps1 = solve(inputArray);
        int swaps2 = solve(reverseArray);
        
        System.out.println((int)Math.min(swaps1,swaps2));
    }
}