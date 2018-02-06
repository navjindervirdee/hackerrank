import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int [] array = new int[n];
            for(int i=0;i<array.length;i++){
                array[i] = in.nextInt();
            }
            int [] maxIndex = new int[n];
            maxIndex[0] = 0;
            int max = array[0];
            int index = 0;
            for(int i=1;i<n;i++){
                if(array[i]>max){
                    maxIndex[i] = i;
                    max = array[i];
                    index = i;
                    continue;
                }
                maxIndex[i] = index;
            }
            String winner = "BOB";
            while(index>0){
                index = maxIndex[index-1];
                if(winner=="BOB"){
                    winner = "ANDY";
                }
                else{
                    winner = "BOB";
                }
            }
            
            System.out.println(winner);
        }
    }
}