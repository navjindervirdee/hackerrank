import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the ways function below.
    static long ways(int n, int[] coins) {
        Arrays.sort(coins);
        long min [] = new long[n+1];
        min[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<n+1;j++){
                if(coins[i]>j){
                    continue;
                }
                min[j] += min[j-coins[i]];
            }
        }
        return min[n];
    }

    /*// Complete the ways function below.
    static long ways(int n, int[] coins) {
        Arrays.sort(coins);
        long [][] table = new long[n+1][coins.length+1];
        for(int i=0;i<n+1;i++){
            table[i][0] = 0;
        }
        
        for(int i=0;i<coins.length+1;i++){
            table[0][i] = 1;
        }
        
        for(int i=1;i<n+1;i++){
            int index = -1;
            for(int j=1;j<coins.length+1;j++){
                if(coins[j-1]>i){
                    index = j;
                    break;
                }
                int money = i-coins[j-1];
                long ways = 0;
                while(money>=0){
                    ways += table[money][j-1];
                    money -= coins[j-1];
                }
                table[i][j] += table[i][j-1] + ways;
                System.out.println(i + " " + j + " " + table[i][j]);
            }
            if(index==-1){
                continue;
            }
            for(int j=index;j<coins.length+1;j++){
                table[i][j] = table[i][j-1];
            }
        }
        
        
        return table[n][coins.length];
    }*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] coins = new int[m];

        String[] coinsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int coinsItem = Integer.parseInt(coinsItems[i]);
            coins[i] = coinsItem;
        }

        long res = ways(n, coins);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}