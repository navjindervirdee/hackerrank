import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean findPath(char[][] forest, List<Character> path, int i, int j){
       // System.out.println(path + " " + i + " " + j);
        if(forest[i][j]=='*'){
            return true;
        }
        int size = path.size();
        if(path.get(size-1)!='L'){
            if(j-1>-1 && forest[i][j-1]!='X'){
                path.add('R');
                boolean found = findPath(forest,path,i,j-1);
                if(found){
                    return true;
                }
                else{
                    path.remove(size);
                }
            }
        }
        
        if(path.get(size-1)!='R'){
            if(j+1<forest[0].length && forest[i][j+1]!='X'){
                path.add('L');
                boolean found = findPath(forest,path,i,j+1);
                if(found){
                    return true;
                }
                else{
                    path.remove(size);
                }
            }
        }
        
        if(path.get(size-1)!='U'){
            if(i-1>-1 && forest[i-1][j]!='X'){
                path.add('D');
                boolean found = findPath(forest,path,i-1,j);
                if(found){
                    return true;
                }
                else{
                    path.remove(size);
                }
            }
        }
        
        if(path.get(size-1)!='D'){
            if(i+1<forest.length && forest[i+1][j]!='X'){
                path.add('U');
                boolean found = findPath(forest,path,i+1,j);
                if(found){
                    return true;
                }
                else{
                    path.remove(size);
                }
            }
        }
        return false;
    }
    
    private static int getCount(char [][] forest, List<Character> path, int i,int j){
        //System.out.println(path);
        forest[i][j] = '.';
        int k = path.size()-1;
        if(path.get(k)=='R'){
            i = i;
            j = j+1;
        }
        
        if(path.get(k)=='L'){
            i = i;
            j = j-1;
        }
        
        if(path.get(k)=='U'){
            i = i-1;
            j = j;
        }
        
        if(path.get(k)=='D'){
            i = i+1;
            j = j;
        }
        
        int count = 0;
        //System.out.println(i + " " + j + " " + k);
        
        while(k>0){
            int directions = 0;
            if(path.get(k-1)!='R'){
                if(j+1<forest[0].length && forest[i][j+1]=='.'){
                    directions++;
                }
            }
            
            if(path.get(k-1)!='L'){
                if(j-1>-1 && forest[i][j-1]=='.'){
                    directions++;
                }
            }
            
            if(path.get(k-1)!='U'){
                if(i-1>-1 && forest[i-1][j]=='.'){
                    directions++;
                }
            }
            
            if(path.get(k-1)!='D'){
                if(i+1<forest.length && forest[i+1][j]=='.'){
                    directions++;
                }
            }
            if(directions>1){
                count++;
            }
           // System.out.println(count + " " + (k-1) + " " + i + " " + j);
            if(k-1>-1 && path.get(k-1)=='R'){
                i = i;
                j = j+1;
                k--;
                continue;
            }
            
            if(k-1>-1 && path.get(k-1)=='L'){
                i = i;
                j = j-1;
                k--;
                continue;
            }
        
            if(k-1>-1 && path.get(k-1)=='U'){
                i = i-1;
                j = j;
                k--;
                continue;
            }
        
            if(k-1>-1 && path.get(k-1)=='D'){
                i = i+1;
                j = j;
                k--;
                continue;
            }
            k--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int n = input.nextInt();
            int m = input.nextInt();
            char [][] forest = new char[n][m];
            input.nextLine();
            int starti = 0;
            int startj = 0;
            int endi = 0;
            int endj = 0;
            
            for(int i=0;i<n;i++){
                String row = input.nextLine();
                for(int j=0;j<m;j++){
                    forest[i][j] = row.charAt(j);
                    if(forest[i][j]=='M'){
                        starti = i;
                        startj = j;
                    }
                    if(forest[i][j]=='*'){
                        endi = i;
                        endj = j;
                    }
                }
            }
            
            int k = input.nextInt();
            
            List<Character> path = new ArrayList<Character>();
            path.add('N');

            findPath(forest,path,starti,startj);
            int count = getCount(forest,path,endi,endj);
            if(count==k){
                System.out.println("Impressed");
            }
            else{
                System.out.println("Oops!");
            }
            
        }
    }
}