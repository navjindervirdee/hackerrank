import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(scanner.nextLine());
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            a[i] = aItem;
        }
        
        PriorityQueue<Double> maxHeap = new PriorityQueue<Double>(new Comparator<Double>(){
            public int compare(Double i1, Double i2){
                return (int)(i2 - i1);
            }
        });
        
        PriorityQueue<Double> minHeap = new PriorityQueue<Double>();
        double first = a[0];
        maxHeap.add(first);
        String median = String.format("%.1f",new Double(first));
        
        String [] list = new String[n];
        list[0] = median;
        
        boolean equalSize = false;
        
        for(int i=1;i<n;i++){
            double num = a[i];
            
            double temp = maxHeap.peek();
            if(num>temp){
                minHeap.add(num);
            }
            
            else{
                maxHeap.add(num);
            }

            if(maxHeap.size()+1>minHeap.size()+1){
                temp = maxHeap.poll();
                minHeap.add(temp);
            }
            if(maxHeap.size()+1<minHeap.size()+1){
                temp = minHeap.poll();
                maxHeap.add(temp);
            }

            if(maxHeap.size()==minHeap.size()){
                Double sum = new Double(minHeap.peek() + maxHeap.peek());
                median = String.format("%.1f",sum/2.0);
                list[i] = median;
            }
            else{
                if(maxHeap.size()>minHeap.size()){
                    median = String.format("%.1f",new Double(maxHeap.peek()));
                    list[i] = median;
                }
                else{
                    median = String.format("%.1f",new Double(minHeap.peek()));
                    list[i] = median;
                }
            }
        }
        for(String s : list){
            System.out.println(s);
        }
        
        scanner.close();
    }
}
