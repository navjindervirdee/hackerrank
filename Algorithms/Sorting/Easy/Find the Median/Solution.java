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
        int mid = list.size()/2;
        System.out.println(list.get(mid));
        
    }
}