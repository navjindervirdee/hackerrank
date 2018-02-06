import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(int n, int m){
        long rows = n;
        long cols = m;
        return (rows-1) + rows*(cols-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long result = solve(n, m);
        System.out.println(result);
    }
}
