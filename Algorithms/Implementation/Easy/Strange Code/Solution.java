import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = Long.parseLong(in.nextLine().trim());
        long rem = 3;
        while(t>rem){
            t = t - rem;
            rem = rem*2;
        }
        System.out.println(rem-t+1);
    }
}
