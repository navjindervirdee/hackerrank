import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        if(y2>=y1){
            if(y2>y1){
                System.out.println(0);
            }
            else{
                if(m2>=m1){
                    if(m2>m1){
                        System.out.println(0);
                    }
                    else{
                        if(d2>=d1){
                            System.out.println(0);
                        }
                        else{
                            int diff = d1-d2;
                            System.out.println(15*diff);
                        }
                    }
                }
                else{
                    int diff = m1-m2;
                    System.out.println(500*diff);
                }
            }
        }
        else{
            System.out.println(10000);
        }
    }
}
