import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int diff1 = Math.abs(x-z);
            int diff2 = Math.abs(y-z);
            if(diff1==diff2){
                System.out.println("Mouse C");
                continue;
            }
            if(diff1<diff2){
                System.out.println("Cat A");
                continue;
            }
            if(diff2<diff1){
                System.out.println("Cat B");
            }
        }
    }
}
