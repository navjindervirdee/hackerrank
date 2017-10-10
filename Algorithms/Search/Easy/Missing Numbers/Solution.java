import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            if(map1.containsKey(num)){
                map1.put(num,map1.get(num)+1);
                continue;
            }
            map1.put(num,new Integer(1));
        }
        
        int m = input.nextInt();
        Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++){
            int num = input.nextInt();
            if(map2.containsKey(num)){
                map2.put(num,map2.get(num)+1);
                continue;
            }
            map2.put(num,new Integer(1));
        }
        
        SortedSet<Integer> set = new TreeSet<Integer>();
        for(int key : map2.keySet()){
            if(!map1.containsKey(key)){
                set.add(key);
                continue;
            }
            int value1 = map1.get(key);
            int value2 = map2.get(key);
            if(value1!=value2){
                set.add(key);
            }    
        }
        
        for(int key : set){
            System.out.print(key + " ");
        }
        System.out.println();
    }
}