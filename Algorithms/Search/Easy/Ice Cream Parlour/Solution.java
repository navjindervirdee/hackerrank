import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int m = input.nextInt();
            int n = input.nextInt();
            int [] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = input.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                int left = m-array[i];
                if(left<0){
                    continue;
                }
                if(map.containsKey(left)){
                    int min = Math.min(map.get(left),i) + 1;
                    int max = Math.max(map.get(left),i) + 1;
                    System.out.println(min + " " + max);
                    break;
                }
                map.put(array[i],i); 
            }
        }
    }
}