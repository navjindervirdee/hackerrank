import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int n = input.nextInt();
        
        BigInteger x0 = new BigInteger(Integer.toString(t1));
        BigInteger x1 = new BigInteger(Integer.toString(t2));
        
        for(int i=2;i<n;i++){
            BigInteger temp = x0.add(x1.multiply(x1));
            x0 = x1;
            x1 = temp;
        }
        System.out.println(x1);
            
    }
}
