import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        int count = 0;
        char [] chars = B.toCharArray();
        for(int i=0;i<chars.length-2;i++){
            if(chars[i]=='0'){
                if(chars[i+1]=='1'){
                    if(chars[i+2]=='0'){
                        count++;
                        chars[i+2]='1';
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
