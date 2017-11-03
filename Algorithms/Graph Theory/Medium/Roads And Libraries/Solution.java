import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Vertex{
        int vertexNum;
        List<Integer> edgeList;
        boolean processed;
        int componentId;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.edgeList = new ArrayList<Integer>();
            this.componentId = -1;
            this.processed = false;
        }
    }
    
    private static Vertex [] initialize(int n){
        Vertex [] graph = new Vertex[n];
        for(int i=0;i<n;i++){
            graph[i] = new Vertex(i);
        }
        return graph;
    }

    private static void explore(Vertex [] graph, int vertex,int id){
        graph[vertex].processed = true;
        graph[vertex].componentId = id;
        
        List<Integer> list = graph[vertex].edgeList;
        
        for(int i=0;i<list.size();i++){
            int temp = list.get(i);
            if(!graph[temp].processed){
                explore(graph,temp,id);
            }
        }
    }
    
    private static int findComponents(Vertex [] graph){
        int id = 0;
        for(int i=0;i<graph.length;i++){
            if(!graph[i].processed){
                explore(graph,i,id);
                id++;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            
            Vertex [] graph = initialize(n);
            
            int m = in.nextInt();
            
            long x = in.nextLong();
            long y = in.nextLong();
            
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt()-1;
                int city_2 = in.nextInt()-1;
                
                graph[city_1].edgeList.add(city_2);
                graph[city_2].edgeList.add(city_1);
            }
            
            int numComponents = findComponents(graph);
            
            long [] count = new long[numComponents];
            for(int i=0;i<n;i++){
                count[graph[i].componentId]++;
            }
            
            long numRoads = 0;
            for(int i=0;i<count.length;i++){
                numRoads += count[i]-1;
            }
            long price1 = numRoads*y + numComponents*x;
            long price2 = x*n;
            System.out.println(Math.min(price1,price2));
        }
    }
}
