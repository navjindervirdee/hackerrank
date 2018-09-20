import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the sherlockAndAnagrams function below.
    static boolean check(int [] array1, int [] array2){
        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }
    
    static int sherlockAndAnagrams(String s) {
        char [] array = s.toCharArray();
        int total =0;
        for(int l=1;l<array.length;l++){
            for(int i=0;i<array.length-l;i++){
                int [] count = new int[26];
                int [] copy = new int[26];
                for(int j=i;j<i+l;j++){
                    int val = array[j]-'a';
                    count[val]++;
                    copy[val] = count[val];
                }
                
                for(int j=i+l;j<array.length;j++){
                    int val = array[j-i-1] - 'a';
                    copy[val]--;
                    val = array[j]-'a';
                    copy[val]++;
                    boolean same = check(count,copy);
                    if(same){
                        total++;
                    }
                }
            }
        }
        
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
