import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int count=0;
            count = count + n/c;
            int wrappers = count;
            while(wrappers>=m){
                count  = count + wrappers/m;
                wrappers = wrappers/m + wrappers%m;
            }
            System.out.println(count);
            
        }
    }
}
