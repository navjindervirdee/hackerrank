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
            long product = 1;
            for(int i=0;i<n-1;i++){
                long routes = input.nextInt();
                product = (product*(routes%1234567))%1234567;
            }
            System.out.println(product);
        }
    }
}