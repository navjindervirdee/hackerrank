import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static String getDecent(int n){
        int count5 = n;
        int count3 = 0;
        int i =0;
        boolean found = false;
        while(i*5<=n){
            int temp3 = i*5;
            int temp5 = n - temp3;
            if(temp5%3==0){
                count5 = temp5;
                count3 = temp3;
                found = true;
                break;
            }
            i++;
        }
        
        if(!found){
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<count5;j++){
            sb.append("5");
        }
        for(int j=0;j<count3;j++){
            sb.append("3");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String decent = getDecent(n);
            System.out.println(decent);
        }
    }
}
