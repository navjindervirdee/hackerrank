import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jumps = 0;
        int start = 0;
        while(start != n-1){
            if(start+2<n && c[start+2]==0){
                start+=2;
            }
            else{
                start++;
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
