import java.util.*;
public class Solution {
    
    static void swap(int array [], int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
       
          static void partition(int[] ar) {
              int pivot = ar[0];
              int index = 0;
              for(int i=1;i<ar.length;i++){
                  if(ar[i]<pivot){
                      index++;
                      swap(ar,index,i);
                  }
              }
              swap(ar,index,0);
              for(int i=0;i<ar.length;i++){
                  System.out.print(ar[i] + " ");
              }
              System.out.println();
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
