import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        
        Collections.sort(list);
        
        int min = 100000000;
        for(int i=0;i<n-1;i++){
            int diff = Math.abs(list.get(i)-list.get(i+1));
            if(min>diff){
                min = diff;
            }
        }
        
        List<Integer> pairs = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            int diff = Math.abs(list.get(i)-list.get(i+1));
            if(diff==min){
                pairs.add(list.get(i));
                pairs.add(list.get(i+1));
            }
        }
        
        for(int i=0;i<pairs.size();i++){
            System.out.print(pairs.get(i) + " ");
        }
    }
}