import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int smallx = 0;
        int largex = 0;
        int smallv = 0;
        int largev = 0;
        if(v1>v2){
            smallx = x2;
            largex = x1;
            smallv = v2;
            largev= v1;
        }
        else{
            smallx = x1;
            largex = x2;
            smallv =v1;
            largev = v2;
        }
        
        while(true){
            if(largex>smallx){
                break;
            }
            if(largex==smallx){
                return "YES";
            }
            largex = largex + largev;
            smallx = smallx + smallv;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
