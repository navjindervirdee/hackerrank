import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
                continue;
            }
            map.put(a[i],new Integer(1));
        }
        
        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
