import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Set<Integer> findUniform(String s){
        int count=1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=1;i<s.length();i++){
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);
            
            int ascii = ((int)c1 - 97 + 1)*count;
            set.add(ascii);
            
            if(c1==c2){
                count++;
                if(i==s.length()-1){
                    ascii = ((int)c1 - 97 + 1)*count;
                    set.add(ascii);
                }
            }
            else{
                count = 1;
                if(s.length()-1==i){
                    set.add(((int)c2 - 97 +1));
                }
            }
        }
        if(s.length()==1){
            set.add(((int)s.charAt(0))-97+1);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<Integer> set = findUniform(s);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(set.contains(x)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
