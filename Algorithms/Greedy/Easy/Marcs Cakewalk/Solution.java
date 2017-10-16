import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
            list.add(calories[calories_i]);
        }
        Collections.sort(list);
        long miles = 0;
        int j=0;
        for(int i=list.size()-1;i>-1;i--){
            miles = miles + (long)(Math.pow(2,j)*list.get(i));
            j++;
        }
        System.out.println(miles);
    }
}
