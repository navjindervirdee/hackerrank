import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        int length = S.length()/3;
        String sub = "SOS";
        for(int i=0;i<length-1;i++){
            sub = sub + "SOS";
        }
        for(int i=0;i<S.length();i++){
            if(sub.charAt(i)!=S.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
