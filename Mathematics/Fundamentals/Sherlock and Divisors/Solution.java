import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int n = input.nextInt();
            int sqrt = (int)Math.sqrt(n)+1;
            int count = 0;
            for(int i=1;i<sqrt;i++){
                if(n%i==0){
                    if(i%2==0){
                        count++;
                    }
                    if(i!=(n/i) && (n/i)%2==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}