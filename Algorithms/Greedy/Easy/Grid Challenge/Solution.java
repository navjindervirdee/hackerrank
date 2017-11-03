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
            input.nextLine();
            List [] grid = new ArrayList[n];
            for(int i=0;i<n;i++){
                String row = input.nextLine();
                grid[i] = new ArrayList<Character>();
                for(int j=0;j<n;j++){
                    grid[i].add(row.charAt(j));
                }
            }
            
            for(int i=0;i<n;i++){
                Collections.sort(grid[i]);
            }
            
            boolean possible = true;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n-1;j++){
                    if(((char)grid[j].get(i))>((char)grid[j+1].get(i))){
                        possible = false;
                        break;
                    }
                }
            }
            
            if(possible){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}