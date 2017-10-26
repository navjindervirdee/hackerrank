import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int [] luck = new int[n];
        int [] imp = new int[n];
        for(int i=0;i<n;i++){
            luck[i] = input.nextInt();
            imp[i] = input.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        int sum =0;
        int count = 0;
        for(int i=0;i<n;i++){
            sum = sum + luck[i];
            if(imp[i]==1){
                list.add(luck[i]);
                count++;
            }
        }
        
        Collections.sort(list);
        for(int i=0;i<count-k;i++){
            sum = sum - list.get(i)*2;
        }
        System.out.println(sum);
        
    }
}