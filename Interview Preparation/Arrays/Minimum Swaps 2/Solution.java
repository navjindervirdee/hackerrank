import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int [] sorted = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sorted[i] =arr[i];
        }
        Arrays.sort(sorted);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<sorted.length;i++){
            map.put(sorted[i],i);
        }
        
        int min = 0;
        boolean [] done = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(map.get(num)==i || done[i]){
                continue;
            }
            
            int count = 0;
            int j = i;
            while(!done[j]){
                done[j] = true;
                count++;
                j = map.get(arr[j]);
            }
            
            count--;
            min += count;
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
