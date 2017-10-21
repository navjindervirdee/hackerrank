import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        double sq = Math.sqrt(s.length());
        int row = (int)Math.floor(sq);
        int col = (int)Math.ceil(sq);
        if(row*row>=s.length()){
            col = row;
        }
        else{
            if(row*col<s.length()){
                row = col;
            }
        }
        
        char [][] mat = new char[row][col];
        int k = 0;
        for(int i=0;i<row;i++){
            boolean space = true;
            for(int j=0;j<col;j++){
                if(k>=s.length()){
                    space = false;
                    break;
                }
                mat[i][j]=s.charAt(k);
                k++;
            }
        }
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                if(mat[i][j]=='\u0000'){
                    break;
                }
                System.out.print(mat[i][j]);
            }
            System.out.print(" ");
        }
        
    }
}
