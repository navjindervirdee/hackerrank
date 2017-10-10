import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String find = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int j=0;
            boolean found = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==find.charAt(j)){
                    j++;
                }
                if(j==find.length()){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
