import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Vertex{
        int vertexNum;
        Set<Integer> set;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.set = new HashSet<Integer>();
        }
        
        
    }
    
    static int edgesRemoved;
    
    public static Vertex [] initialize(int n){
            Vertex [] graph = new Vertex[n];
            for(int i=0;i<n;i++){
                graph[i] = new Vertex(i);
            }
            return graph;
    }
    
    private static int removeEdges(Vertex [] graph,int vertex){
        //System.out.println("vertex : " + vertex);
        Set<Integer> set = new HashSet<Integer>(graph[vertex].set);
        int totalnodes = 0;
        for(int key : set){
            int nodes = removeEdges(graph,key) + 1;
           // System.out.println("key : " + key + " " + nodes);
            if(nodes%2==0){
                edgesRemoved++;
                continue;
            }
            totalnodes += nodes;
        }
        return totalnodes;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int m = input.nextInt();
        Vertex [] graph = initialize(n);
        
        for(int i=0;i<m;i++){
            int u = input.nextInt()-1;
            int v = input.nextInt()-1;
            
            graph[v].set.add(u);
        }
        
        
        edgesRemoved = 0;
        removeEdges(graph,0);
        System.out.println(edgesRemoved);
        
    }
}