import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int px = input.nextInt();
            int py = input.nextInt();
            int qx = input.nextInt();
            int qy = input.nextInt();
            
            int dx = Math.abs(px-qx);
            int dy = Math.abs(py-qy);
            
            int rx = px;
            int ry = py;
            if(px>qx){
                rx = px - dx*2;
            }
            else{
                rx = px + dx*2;
            }
            
            if(py>qy){
                ry = py - dy*2;
            }
            else{
                ry = py + dy*2;
            }
            System.out.println(rx + " " + ry);
        }
    }
}