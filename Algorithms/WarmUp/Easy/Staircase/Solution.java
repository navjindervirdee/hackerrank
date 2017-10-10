import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("#");    
            }
            System.out.println();
        }
    }
}
