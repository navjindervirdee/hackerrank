import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        boolean am = s.contains("AM");
        if(am){
            s=s.replace("AM","");
            String hr = s.substring(0,2);
            if(hr.equals("12")){
                s = "00" + s.substring(2);
                return s; 
            }
            else{
                return s;
            }
        }
        else{
            s = s.replace("PM","");
            String hr = s.substring(0,2);
            if(hr.equals("12")){
                return s;
            }
            
            
            int hour = Integer.parseInt(hr);
            hour = hour + 12;
            hr = Integer.toString(hour);
            s = hr + s.substring(2);
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
