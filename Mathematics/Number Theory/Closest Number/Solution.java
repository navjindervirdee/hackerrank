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
            int a = input.nextInt();
            int b = input.nextInt();
            int x = input.nextInt();
            
            double result = Math.pow(a,b);
            
            int div1 = ((int)result)/x;
            int div2 = div1+1;
            
            if(Math.abs(x*div2-(int)result) >= Math.abs(x*div1-(int)result)){
                System.out.println(x*div1);    
            }
            else{
                System.out.println(x*div2);    
            }
            
        }
    }
}