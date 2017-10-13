import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String encrypt = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                encrypt = encrypt + c;
                continue;
            }
            int ascii = (int)c;
            if(ascii>=65 && ascii<=90){
                ascii = 65 + (ascii - 65 + k)%26;
                encrypt = encrypt + (char)ascii;
                
            }
            else{
                ascii = 97 + (ascii-97+k)%26;
                encrypt = encrypt + (char)ascii;
            }
        }
        System.out.println(encrypt);
    }
}
