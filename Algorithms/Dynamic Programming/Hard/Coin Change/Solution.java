import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static long getCount(long n, long [] c, Map<String,Long> map, int index){
        if(n==0){
            return 1;
        }
        
        if(index>=c.length){
            return 0;
        }
            
        String key = n+"-"+index;
        
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        long amount = 0;
        long ways = 0;
        
        while(amount<=n){
            long remaining = n-amount;
            ways += getCount(remaining, c, map,index +1);
            amount = amount + c[index];
        }
        map.put(key,ways);
        return ways;
    }
    
    static long getWays(long n, long[] c){
        Map<String, Long> map = new HashMap<String, Long>();
        long ways = getCount(n,c,map,0);
        return ways;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
