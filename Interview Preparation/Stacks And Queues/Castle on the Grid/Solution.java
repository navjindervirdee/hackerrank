import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class Cell{
        int i;
        int j;
        
        public Cell(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    
    static void bfs(char [][] array, int [][] dist, int startX, int startY, int goalX, int goalY){
        dist[startX][startY] = 0;
        Cell start = new Cell(startX,startY);
        Queue<Cell> queue = new LinkedList<Cell>();
        //Queue<Cell> pos = new LinkedList<Cell>();
        queue.add(start);
        //pos.add(start);
        
        
        while(!queue.isEmpty()){
            Cell cell = queue.poll();
            int i = cell.i;
            int j = cell.j;
            int val = dist[i][j]+1;
            //Cell s = pos.poll();
            //int si = s.i;
            //int sj = s.j;
            
            for(int k=i+1;k<array.length;k++){
                if(array[k][j]=='X'){
                    break;
                }
                if(dist[k][j]>val){
                    Cell temp = new Cell(k,j);
                    dist[k][j] = val;
                    queue.add(temp);
                }
            }
            
            for(int k=i-1;k>-1;k--){
                if(array[k][j]=='X'){
                    break;
                }
                if(dist[k][j]>val){
                    dist[k][j] = val;
                    Cell temp = new Cell(k,j);
                    queue.add(temp);
                }
            }
            
            for(int k =j+1;k<array[0].length;k++){
                if(array[i][k]=='X'){
                    break;
                }
                if(dist[i][k]>val){
                    dist[i][k] = val;
                    Cell temp = new Cell(i,k);
                    queue.add(temp);
                }
            }
            
            for(int k =j-1;k>-1;k--){
                if(array[i][k]=='X'){
                    break;
                }
                if(dist[i][k]>val){
                    dist[i][k] = val;
                    Cell temp = new Cell(i,k);
                    queue.add(temp);
                }
            }
            /*
            
            if(i+1<array.length && array[i+1][j]=='.'){
                if(sj==j && dist[i+1][j]>dist[i][j]){
                    Cell temp = new Cell(i+1,j);
                    queue.add(temp);
                    dist[i+1][j] = dist[i][j];
                    pos.add(s);
                }
                else{
                    if(dist[i+1][j]>dist[i][j]+1){
                        Cell temp = new Cell(i+1,j);
                        queue.add(temp);
                        dist[i+1][j] = dist[i][j]+1;
                        pos.add(temp);
                    }
                }
            }
            
            if(i-1>-1 && array[i-1][j]=='.'){
                if(sj==j && dist[i-1][j]>dist[i][j]){
                    Cell temp = new Cell(i-1,j);
                    queue.add(temp);
                    dist[i-1][j] = dist[i][j];
                    pos.add(s);
                }
                else{
                    if(dist[i-1][j]>dist[i][j]+1){
                        Cell temp = new Cell(i-1,j);
                        queue.add(temp);
                        dist[i-1][j] = dist[i][j]+1;
                        pos.add(temp);
                    }
                }
            }
            
            if(j+1<array[0].length && array[i][j+1]=='.'){
                if(si==i && dist[i][j+1]>dist[i][j]){
                    Cell temp = new Cell(i,j+1);
                    queue.add(temp);
                    dist[i][j+1] = dist[i][j];
                    pos.add(s);
                }
                else{
                    if(dist[i][j+1]>dist[i][j]+1){
                        Cell temp = new Cell(i,j+1);
                        queue.add(temp);
                        dist[i][j+1] = dist[i][j]+1;
                        pos.add(temp);
                    }
                }
            }
            
            if(j-1>-1 && array[i][j-1]=='.'){
                if(si==i && dist[i][j-1]>dist[i][j]){
                    Cell temp = new Cell(i,j-1);
                    queue.add(temp);
                    dist[i][j-1] = dist[i][j];
                    pos.add(s);
                }
                else{
                    if(dist[i][j-1]>dist[i][j]+1){
                        Cell temp = new Cell(i,j-1);
                        queue.add(temp);
                        dist[i][j-1] = dist[i][j]+1;
                        pos.add(temp);
                    }
                }
            }*/
        }
    }
    
    // Complete the minimumMoves function below.
    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        char [][] array = new char[grid.length][grid[0].length()];
        int [][] dist = new int[grid.length][grid[0].length()];
        
        for(int i=0;i<grid.length;i++){
            char [] temp = grid[i].trim().toCharArray();
            for(int j= 0;j<temp.length;j++){
                array[i][j] = temp[j];
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs(array,dist,startX,startY,goalX,goalY);
        return dist[goalX][goalY];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] startXStartY = scanner.nextLine().split(" ");

        int startX = Integer.parseInt(startXStartY[0]);

        int startY = Integer.parseInt(startXStartY[1]);

        int goalX = Integer.parseInt(startXStartY[2]);

        int goalY = Integer.parseInt(startXStartY[3]);

        int result = minimumMoves(grid, startX, startY, goalX, goalY);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
