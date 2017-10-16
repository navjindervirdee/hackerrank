import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();
        s = s.toLowerCase().replace(" ","");
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()==26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
            
    }
}
