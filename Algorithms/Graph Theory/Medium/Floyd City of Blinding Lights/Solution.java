import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Vertex implements Comparable<Vertex>{
        int vertexNum;
        Map<Integer,Integer> map;
        int queryid;
        boolean processed;
        int distance;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.map = new HashMap<Integer,Integer>();
            this.processed  = false;
            this.distance = Integer.MAX_VALUE;
            this.queryid = -1;
        }
        
        public int compareTo(Vertex v){
            return this.distance-v.distance;
        }
    }
    
    private static Vertex [] initialize(int n){
        Vertex [] graph = new Vertex[n];
        for(int i=0;i<n;i++){
            graph[i] = new Vertex(i);
        }
        return graph;
    }
    
    private static int dijkstra(Vertex [] graph,int source,int target,int queryid,Map<String,Integer> results){
        Queue<Vertex> queue = new PriorityQueue<Vertex>(graph.length);
        //System.out.println("s : " + source + " t : " + target);
        graph[source].distance = 0;
        graph[source].queryid = queryid;
        queue.add(graph[source]);
        while(!queue.isEmpty()){
            Vertex vertex = queue.poll();
            String  s = source + "-" + vertex.vertexNum;
            results.put(s,vertex.distance);
            //System.out.println(vertex.distance);
            if(vertex.vertexNum == target){
                return vertex.distance;
            }
            explore(graph,vertex.vertexNum,queue,queryid);
        }
        return -1;
    }
    
    private static void explore(Vertex [] graph, int vertex, Queue<Vertex> queue, int queryid){
        graph[vertex].queryid = queryid;
        Map<Integer,Integer> map = graph[vertex].map;
        for(int key : map.keySet()){
            if(graph[key].queryid!=queryid){
                graph[key].distance = graph[vertex].distance + map.get(key);
                queue.remove(graph[key]);
                queue.add(graph[key]);
                explore(graph,key,queue,queryid);
            }
            else{
                if(map.get(key)+graph[vertex].distance < graph[key].distance){
                    graph[key].distance = map.get(key) + graph[vertex].distance;
                    queue.remove(graph[key]);
                    queue.add(graph[key]);
                    explore(graph,key,queue,queryid);
                }
            }
        }
    }
    
    private static long [][] floydWarshall(long [][] distances){
        for(int k=0;k<distances.length;k++){
            for(int i=0;i<distances.length;i++){
                for(int j=0;j<distances.length;j++){
                    //System.out.println( i + "-" + j + " thru " + k + " " +   distances[i][j]);
                    if(distances[i][j] > (distances[i][k] + distances[k][j])){
                       //System.out.println("updated : " + distances[i][j] + " " + distances[i][k] + " " + distances[k][j]);
                        distances[i][j] = distances[i][k] + distances[k][j];
                    }
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        Vertex [] graph = initialize(n);
        
        long [][] distances  = new long[n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                distances[i][j] = Integer.MAX_VALUE;
            }
        }
        
        
        for(int i=0;i<m;i++){
            int u = input.nextInt()-1;
            int v = input.nextInt()-1;
            int w = input.nextInt();
            distances[u][v] = w;
            graph[u].map.put(v,w);
        }
        
        for(int i=0;i<n;i++){
            distances[i][i] = 0;
        }
        
        /*for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(distances[i][j] + " ");
            }
            System.out.println();
        }*/
        distances = floydWarshall(distances);
        //System.out.println();
        /*for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(distances[i][j] + " ");
            }
            System.out.println();
        }*/
        int q = input.nextInt();
        
        Map<String, Integer> results = new HashMap<String,Integer>();
        
        for(int i=0;i<q;i++){
            int s = input.nextInt()-1;
            int t = input.nextInt()-1;
            //System.out.println(s + " " + t + " " + distances[s][t]);
            if(distances[s][t]==Integer.MAX_VALUE){
                System.out.println(-1);
                continue;
            }
            System.out.println(distances[s][t]);
            
            //String query = s + "-" + t;
            //if(results.containsKey(query)){
            //    System.out.println(results.get(query));
            //    continue;
            //}
            
            /*int distance = dijkstra(graph,s,t,i,results);
            results.put(query,distance);
            System.out.println(distance);*/
        }
        
    }
}