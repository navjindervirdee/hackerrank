import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int getSum(int n){
        String str = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int best = -1;
        int div = -1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                int temp = getSum(i);
                if(temp>best){
                    best = temp;
                    div = i;
                }
            }
        }
        System.out.println(div);
    }
}
