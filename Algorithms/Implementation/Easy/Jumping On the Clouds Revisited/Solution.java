import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int start = (0+k)%n;
        int energy = 100;
        while(start!=0){
            if(c[start]==0){
                energy--;
            }
            else{
                energy = energy-3;
            }
            start = (start+k)%n;
        }
        if(c[0]==1){
            energy-=3;
        }
        else{
            energy--;
        }
        System.out.println(energy);
    }
}
