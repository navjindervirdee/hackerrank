import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int n = input.nextInt();
            int k = input.nextInt();
            int [] array1 = new int[n];
            int [] array2 = new int[n];
            for(int i=0;i<n;i++){
                array1[i] = input.nextInt();
            }
            for(int i=0;i<n;i++){
                array2[i] = input.nextInt();
            }
            Arrays.sort(array1);
            Arrays.sort(array2);
            
            boolean permutation = true;
            for(int i=0;i<array1.length;i++){
                int num = Math.abs(array1[i]-k);
                boolean found = false;
                for(int j=0;j<array2.length;j++){
                    if(array2[j]==-1){
                        continue;
                    }
                    if(array2[j]>=num){
                        found = true;
                        array2[j] = -1;
                        break;
                    }
                }
                if(!found){
                    permutation = false;
                    break;
                }
            }
            if(permutation){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}