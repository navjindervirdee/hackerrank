import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        char [] array1 = s1.toCharArray();
        char [] array2 = s2.toCharArray();
        
        int [][] table = new int[array1.length+1][array2.length+1];
        
        for(int i=1;i<array1.length+1;i++){
            for(int j=1;j<array2.length+1;j++){
                if(array1[i-1]==array2[j-1]){
                    table[i][j] = Math.max(Math.max(table[i-1][j-1]+1,table[i-1][j]),table[i][j-1]);
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        return table[array1.length][array2.length];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
