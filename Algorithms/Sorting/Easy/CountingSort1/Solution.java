import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        int [] count = new int[100];
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            array[i] = num;
            count[num]++;
        }
        
        for(int i=0;i<100;i++){
            System.out.print(count[i] + " ");
        }
        System.out.println();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}