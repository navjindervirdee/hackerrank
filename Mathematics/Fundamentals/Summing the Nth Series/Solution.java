import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int i=0;i<t;i++){
            long n = Long.parseLong(input.nextLine().trim());
            n = n%1000000007;
            n = (n*n)%1000000007;
            System.out.println(n);
        }
        
    }
}