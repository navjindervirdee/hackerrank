import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int getCount(int [] tower,int k){
        int next = -1;
        int count = 0;
        int prev = -1;
        while(next<tower.length-1){
            int on = Math.min(next+k,tower.length-1);
            while(on>prev){
                if(tower[on]==1){
                    break;
                }
                on--;
            }
            if(on==prev){
                return -1;
            }
            count++;
            prev = on;
            next = on + k-1;
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int [] tower = new int[n];
        for(int i=0;i<n;i++){
            tower[i] = input.nextInt();
        }
        
        int count = getCount(tower,k);
        System.out.println(count);
    }
}