import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static boolean checkSame(int [] count){
        int num = -1;
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                continue;
            }
            if(num==-1){
                num = count[i];
                continue;
            }
            if(num!=count[i]){
                return false;
            }
        }
        return true;
    }
    
    // Complete the isValid function below.
    static String isValid(String s) {
        char [] array = s.toCharArray();
        int [] count = new int[26];
        for(int i=0;i<array.length;i++){
            int val = array[i]-'a';
            count[val]++;
        }
        
        boolean same = checkSame(count);
        if(same){
            return "YES";
        }
        
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                continue;
            }
            count[i]--;
            same = checkSame(count);
            if(same){
                return "YES";
            }
            count[i]++;
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
