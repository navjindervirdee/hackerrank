import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        for(int c=0;c<t;c++){
            int l = input.nextInt();
            int b = input.nextInt();
            int i = 1;
            int best = -1;
            while(i<=l && i<=b){
                if(l%i==0 && b%i==0){
                    best = (l/i)*(b/i);
                }
                i++;
            }
            System.out.println(best);
            
        }
    }
}