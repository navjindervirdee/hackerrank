import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Vertex{
        int vertexNum;
        List<Integer> edgeList;
        int distance;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.edgeList = new ArrayList<Integer>();
            this.distance = -1;
        }
    }
    
    private static Vertex [] initialize(int n){
        Vertex [] graph = new Vertex[n];
        for(int i=0;i<n;i++){
            graph[i] = new Vertex(i);
        }
        return graph;
    }
    
    private static void bfs(Vertex [] graph, int source){
        Queue<Vertex> queue = new LinkedList<Vertex>();
        graph[source].distance = 0;
        queue.add(graph[source]);
        while(!queue.isEmpty()){
            Vertex vertex = queue.poll();
            List<Integer> list = vertex.edgeList;
            for(int i=0;i<list.size();i++){
                Vertex temp = graph[list.get(i)];
                if(temp.distance==-1){
                    temp.distance = vertex.distance+1;
                    queue.add(temp);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            Vertex [] graph = initialize(n);
            int m = in.nextInt();
            for(int a1 = 0; a1 < m; a1++){
                int u = in.nextInt()-1;
                int v = in.nextInt()-1;
                graph[u].edgeList.add(v);
                graph[v].edgeList.add(u);
            }
            int s = in.nextInt()-1;
            
            bfs(graph,s);
            for(int i=0;i<graph.length;i++){
                if(i==s){
                    continue;
                }
                if(graph[i].distance==-1){
                    System.out.print(-1 + " ");
                }
                else{
                    System.out.print(graph[i].distance*6 + " ");    
                }
            }
            System.out.println();
        }
        in.close();
        
        
    }
}
