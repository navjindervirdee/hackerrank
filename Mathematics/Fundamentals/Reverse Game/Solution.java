import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int c=0;c<t;c++){
            int n = in.nextInt();
            int k = in.nextInt();
            int pos = 0;
            int i = 0;
            int j = n-1;
            int ball = -1;
            while(ball!=k){
                if(pos%2==0){
                    ball = j;
                    j--;
                }
                else{
                    ball = i;
                    i++;
                }
                pos++;
            }
            System.out.println(pos-1);
        }
    }
}
