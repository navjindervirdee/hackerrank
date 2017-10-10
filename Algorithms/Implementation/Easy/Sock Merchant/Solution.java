import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(ar[i]);
        }
        Collections.sort(list);
        int pairs = 0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)){
                pairs++;
                list.set(i,0);
                list.set(i-1,0);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
