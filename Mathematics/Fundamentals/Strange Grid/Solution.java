import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long r = input.nextInt()-1;
        int c = input.nextInt();
        long [] odd = new long[5];
        odd[0] = 1;
        odd[1] = 3;
        odd[2] = 5;
        odd[3] = 7;
        odd[4] = 9;
        long ans = r/2;
        ans = ans*10;
        if(r%2==0){
            ans += odd[c-1]-1;
        }
        else{
            ans += odd[c-1];
        }
        System.out.println(ans);
        
    }
}