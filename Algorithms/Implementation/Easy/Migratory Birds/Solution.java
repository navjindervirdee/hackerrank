import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int [] count = new int[5];
        for(int i=0;i<n;i++){
            count[ar[i]-1]++;
        }
        
        int max = -1;
        int id = -1;
        for(int i=0;i<count.length;i++){
            if(count[i]==max){
                if(id>i){
                    id = i;
                }
                continue;
            }
            if(count[i]>max){
                max =  count[i];
                id = i;
            }
        }
        return id+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
