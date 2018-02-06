import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine();
        char [] encoded = input.nextLine().trim().toCharArray();
        
        int prevXor = 0;
        char [] decoded = new char[n];
        for(int i=0;i<n;i++){
            int index = i-(k-1)-1;
            int bit = 0;
            if(index>=0){
                bit = Character.digit(decoded[index],10);
            }
            bit = bit^prevXor;
            bit = bit^Character.digit(encoded[i],10);
            decoded[i] = Character.forDigit(bit,10);
            prevXor = Character.digit(encoded[i],10);
        }
        for(int i=0;i<decoded.length;i++){
            System.out.print(decoded[i]);
        }
        System.out.println();
    }
}