import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int count=0;
    private static void findCount(int x,int n,int sum,int num){
        if(num>(int)Math.ceil(Math.sqrt(x))){
            return;
        }
        int power = (int)Math.pow(num,n);
        if(sum+power>x){
            return;
        }
        if(sum+power==x){
            count=count+1;
            return;
        }
        findCount(x,n,sum+power,num+1);
        findCount(x,n,sum,num+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        int sum = 0;
        int num = 1;
        count = 0;
        findCount(x,n,sum,num);
        System.out.println(count);
    }
}