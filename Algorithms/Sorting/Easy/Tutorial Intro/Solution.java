import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = input.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                System.out.println(i);
                break;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}