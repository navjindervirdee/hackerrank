import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            int squareroot = (int)Math.floor(Math.sqrt(n));
            if(n==1){
                System.out.println("Not prime");
                continue;
            }
            boolean prime = true;
            for(int i=2;i<=squareroot;i++){
                if(n%i==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}
