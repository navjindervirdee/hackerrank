import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int max;
    
    private static boolean calMoves(int [] board,int index,int moves,int start){
        //System.out.println(index + " " + moves);
        if(moves>max){
            return true;
        }
        if(index>=99){
            if(moves<max){
                max = moves;
                
            }
            return true;
        }
        
        int nextMax = index;
        
        boolean path = false;
        for(int i=index+1;i<=index+6;i++){
            if(i==board.length-1){
                return calMoves(board,i,moves+1,start);
            }
            if(board[i]!=0 && board[i]<=start){
                continue;
            }
            
            if(board[i]>start){
                boolean result = calMoves(board,board[i],moves+1,start);
                path = (path || result);
                continue;
            }
            nextMax = i;
        }
        
        if(nextMax!=index){
            boolean result = calMoves(board,nextMax,moves+1,nextMax);
            path = (path || result);
        }
        return path;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int c=0;c<t;c++){
            int [] board = new int[100];
            max = 99;
            int ladders = input.nextInt();
            for(int i=0;i<ladders;i++){
                int u = input.nextInt()-1;
                int v = input.nextInt()-1;
                board[u] = v;
            }
            
            int snakes = input.nextInt();
            for(int i=0;i<snakes;i++){
                int u = input.nextInt()-1;
                int v = input.nextInt()-1;
                board[u] = v;
            }
            
            boolean path = calMoves(board,0,0,0);
            if(path){
                System.out.println(max);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}