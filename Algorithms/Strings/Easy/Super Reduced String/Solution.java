import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        while(true){
            boolean canReduce = false;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    canReduce = true;
                    if(i+2<=s.length()-1){
                        s = s.substring(0,i) + s.substring(i+2);
                    }
                    else{
                        s = s.substring(0,i);
                    }
                    break;
                }
            }
            if(canReduce){
                continue;
            }
            else{
                break;
            }
        }
        if(s.length()==0){
            return "Empty String";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
