import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array []  = new int[n];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
                continue;
            }
            map.put(array[i], new Integer(1));
        }
        
        int max = -1;
        int sum = 0;
        for(int key : map.keySet()){
            sum  = sum + map.get(key);
            if(max<map.get(key)){
                max = map.get(key);
                continue;
            }
        }
        System.out.println(sum-max);
    }
}