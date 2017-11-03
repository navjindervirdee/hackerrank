import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            if(n==1){
                System.out.println(1);
                continue;
            }
            if(n==2){
                System.out.println(2);
                continue;
            }
            if(n==3){
                System.out.println(4);
                continue;
            }
            else{
                int [] ways = new int[n+1];
                ways[1] = 1;
                ways[2] = 2;
                ways[3] = 4;
                for(int i=4;i<=n;i++){
                    ways[i] = ways[i-3] + ways[i-2] + ways[i-1];
                }
                System.out.println(ways[n]);
            }
        }
    }
}
