import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int count =0;
            int adder = 1;
            int start = a;
            while(start<=b){
                start = start+adder;
                if(start>b){
                    break;
                }
                double sqrt = Math.sqrt(start);
                if(Math.ceil(sqrt)==Math.floor(sqrt)){
                    count++;
                    if(adder==1){
                        adder = (int)(Math.pow((Math.ceil(sqrt)+1),2) - start);
                    }
                    else{
                        adder = adder+2;
                    }
                }
            }
            if(Math.ceil(Math.sqrt(a))==Math.floor(Math.sqrt(a))){
                count++;
            }
            System.out.println(count);
        }
    }
}