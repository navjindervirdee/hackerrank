import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=input.nextInt()-1;
        }
        int [] values = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value = p[p[j]];
                if(value==i){
                    values[i] = j;
                    break;
                }
            }
        }
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]+1);
        }
    }
}
