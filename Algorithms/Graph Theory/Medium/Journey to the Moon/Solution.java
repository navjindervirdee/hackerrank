import java.io.*;
import java.util.*;

public class Solution {
    static class Vertex{
        int vertexNum;
        List<Integer> edgeList;
        int componentId;
        boolean processed;
        
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
    
    private static void explore(Vertex [] graph, int vertex, int id){
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
    
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
        
        Vertex [] graph = initialize(N);
       
        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            graph[a].edgeList.add(b);
            graph[b].edgeList.add(a);
        }

        long combinations = 0;
        
        int numofComponents = findComponents(graph);
        
        long [] count = new long[numofComponents];
        
        for(int i=0;i<graph.length;i++){
            //System.out.println(i + " " + graph[i].componentId);
            count[graph[i].componentId]++;
        }
        
        for(int i=0;i<count.length-1;i++){
            for(int j=i+1;j<count.length;j++){
                combinations = combinations + count[i]*count[j];
            }
        }
        System.out.println(combinations);

    }
}