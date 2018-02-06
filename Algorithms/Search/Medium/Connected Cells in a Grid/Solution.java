import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long max;
    
    private static long dfs(int [][] array,int i,int j,long count){
        if(i<0 || i>=array.length || j<0 || j>=array[0].length){
            return count;
        }
        if(array[i][j]==0){
            return count;
        }
        array[i][j]=0;
        if(max<count+1){
            max = count+1;
        }
        
        count = dfs(array,i,j+1,count+1);
        count = dfs(array,i,j-1,count);
        count = dfs(array,i+1,j,count);
        count = dfs(array,i-1,j,count);
        count = dfs(array,i-1,j-1,count);
        count = dfs(array,i+1,j+1,count);
        count = dfs(array,i-1,j+1,count);
        count = dfs(array,i+1,j-1,count);
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [][] array = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = input.nextInt();
            }
        }
        
        max=0;
        for(int i= 0;i<n;i++){
            for(int j=0;j<m;j++){
                dfs(array,i,j,0);
            }
        }
        System.out.println(max);
    }
}