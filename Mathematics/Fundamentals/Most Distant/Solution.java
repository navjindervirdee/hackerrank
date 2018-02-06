import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double minx = Integer.MAX_VALUE;
        double maxx = Integer.MIN_VALUE;
        double miny = Integer.MAX_VALUE;
        double maxy = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            double x = input.nextInt();
            double y = input.nextInt();
            minx = Math.min(minx, x);
            maxx = Math.max(maxx,x);
            miny = Math.min(miny,y);
            maxy = Math.max(maxy,y);
        }
        
        double max = Math.abs(maxx-minx);
        max = Math.max(Math.abs(maxy-miny),max);
        
        double euc = Math.sqrt(maxx*maxx + maxy*maxy);
        euc = Math.max(euc,Math.sqrt(maxx*maxx + miny*miny));
        euc = Math.max(euc,Math.sqrt(minx*minx + miny*miny));
        euc = Math.max(euc,Math.sqrt(maxx*maxx + maxy*maxy));
        
        System.out.println(Math.max(euc,max));
    }
}