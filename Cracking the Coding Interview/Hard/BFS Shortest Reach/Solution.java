import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Vertex{
        int vertexNum;
        List<Integer> edgeList;
        int distance;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.edgeList = new ArrayList<Integer>();
            this.distance = -1;
        }
    }
    
    public static class Graph {
        Vertex [] graph;
        
        public Graph(int size) {
            graph = new Vertex[size];
            for(int i=0;i<size;i++){
                graph[i] = new Vertex(i);
            }
        }

        public void addEdge(int first, int second) {
            graph[first].edgeList.add(second);
            graph[second].edgeList.add(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            Queue<Vertex> queue = new LinkedList<Vertex>();
            graph[startId].distance = 0;
            queue.add(graph[startId]);
            
            while(!queue.isEmpty()){
                Vertex vertex = queue.poll();
                List<Integer> list = vertex.edgeList;
                for(int i=0;i<list.size();i++){
                    Vertex temp = graph[list.get(i)];
                    if(temp.distance>-1){
                        continue;
                    }
                    temp.distance = vertex.distance+1;
                    queue.add(temp);
                }
            }
            
            int [] distances = new int[graph.length];
            for(int i=0;i<graph.length;i++){
                if(graph[i].distance==-1){
                    distances[i] = -1;
                    continue;
                }
                distances[i] = graph[i].distance*6;
            }
            return distances;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
