import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Vertex implements Comparable<Vertex>{
        int vertexNum;
        long distance;
        Map<Integer,Long> map;
        
        public Vertex(int vertexNum){
            this.vertexNum = vertexNum;
            this.distance = Integer.MAX_VALUE;
            this.map = new HashMap<Integer,Long>();
        }
        
        public int compareTo(Vertex v){
            return (int)(this.distance-v.distance);
        }
        
    }
    
    private static Vertex [] initialize(int n){
        Vertex [] graph=  new Vertex[n];
        for(int i=0;i<n;i++){
            graph[i] = new Vertex(i);
        }
        return graph;
    }
    
    private static void dijkstra(Vertex [] graph, int source){
        Queue<Vertex> queue = new PriorityQueue<Vertex>();
        graph[source].distance = 0;
        queue.add(graph[source]);
        
        while(!queue.isEmpty()){
            Vertex vertex = queue.poll();
            explore(graph,vertex,queue);
        }
    }
    
    private static void explore(Vertex [] graph,Vertex vertex,Queue<Vertex> queue){
        Map<Integer,Long> map = vertex.map;
        
        for(int key: map.keySet()){
            if(graph[key].distance>vertex.distance+map.get(key)){
                graph[key].distance = vertex.distance + map.get(key);
                queue.remove(graph[key]);
                queue.add(graph[key]);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer("");
        int t = Integer.parseInt(br.readLine());
        for(int a0 = 0; a0 < t; a0++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            Vertex [] graph = initialize(n);
            int m = Integer.parseInt(st.nextToken());
            for(int a1 = 0; a1 < m; a1++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;
                long r = Long.parseLong(st.nextToken());
                
                if(graph[x].map.containsKey(y)){
                    if(graph[x].map.get(y)>r){
                        graph[x].map.put(y,r);
                        graph[y].map.put(x,r);
                    }
                    continue;
                }
                else{
                    graph[x].map.put(y,r);
                    graph[y].map.put(x,r);
                }
            }
            int s = Integer.parseInt(br.readLine())-1;
            dijkstra(graph,s);
            
            for(int i=0;i<graph.length;i++){
                if(i==s){
                    continue;
                }
                if(graph[i].distance==Integer.MAX_VALUE){
                    bw.write("-1 ");
                    continue;
                }
                String result = Long.toString(graph[i].distance) + " ";
                bw.write(result);
            }
            bw.flush();
            bw.write("\n");
        }
    }
}