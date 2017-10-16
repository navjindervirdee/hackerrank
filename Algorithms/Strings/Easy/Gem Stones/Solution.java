import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        Set [] sets = new HashSet[arr.length];
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            Set<Character> set = new HashSet<Character>();
            for(int j=0;j<str.length();j++){
                set.add(str.charAt(j));
            }
            sets[i] = set;
        }
        Set unique = sets[0];
        for(int i=1;i<sets.length;i++){
            unique.retainAll(sets[i]);
        }
        return unique.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
