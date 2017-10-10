import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        double num = n;
        double page = p;
        double backCount = (num-page)/2;
        double frontCount = (page-1)/2;
        if(n%2!=0){
            backCount = Math.floor(backCount);
        }
        else{
            backCount = Math.ceil(backCount);    
        }
        frontCount = Math.ceil(frontCount);
        return (int)Math.min(backCount,frontCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
