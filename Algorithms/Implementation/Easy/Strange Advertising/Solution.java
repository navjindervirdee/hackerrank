import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int start = 5;
        int count = 0;
        while(n!=0){
            count = count + start/2;
            start = (start/2)*3;
            n--;
        }
        System.out.println(count);
        
    }
}