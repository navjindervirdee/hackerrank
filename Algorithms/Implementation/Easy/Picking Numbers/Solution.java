import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            list.add(a[a_i]);
        }
        
        Collections.sort(list);
        
        int max = -1;
        for(int i=0;i<list.size();i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                int diff = Math.abs(list.get(i)-list.get(j));
                if(diff<=1){
                    count++;
                    continue;
                }
                else{
                    break;
                }
            }
          
            if(max<count){
                max= count;
            }
        }
        System.out.println(max);
    }
}
