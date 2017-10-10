import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
            list.add(x[x_i]);
        }
        
        Collections.sort(list);
        
        int index = 0;
        int count =0;
        while(index<list.size()){
            int value = list.get(index);
            int maxDist = value + k;
            while(index<list.size() && list.get(index)<=maxDist){
                index++;
            }
            index = index-1;
            count++;
            maxDist = list.get(index) + k;
            while(index<list.size() && list.get(index)<=maxDist){
                index++;
            }
        }
        System.out.println(count);
        
    }
}
