import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int [] array;
    static int size;
    
    private static void add(int data){
        array[size] = data;
        siftUp(size);
    }

    private static void siftUp(int index){
        while((index-1)/2>=0){
            if(array[(index-1)/2]>array[index]){
                int temp = array[(index-1)/2];
                array[(index-1)/2] = array[index];
                array[index] = temp;
                index = (index-1)/2;
            }
            else{
                break;
            }
        }
    }
    
    private static void remove(int data){
        int index = getIndex(data);
        array[index]=-2000000001;
        siftUp(index);
        int temp = array[0];
        array[0] = array[size-1];
        array[size-1] = temp;
        size--;
        siftDown(0);
    }
    
    private static void siftDown(int index){
        int min = index;
        if((index*2+1)<size && array[index*2+1]<array[index]){
            min = index*2+1;
        }
        if((index*2+2)<size && array[index*2+2]<array[min]){
            min = index*2+2;
        }
        if(index!=min){
            int temp = array[index];
            array[index] = array[min];
            array[min] = temp;
            siftDown(min);
        }
    }
    
    private static int getIndex(int data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
        
    public static void main(String[] args) {
        array = new int[1000000];
        size = 0;
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int i=0;i<q;i++){
            int num = input.nextInt();
            if(num==1){
                int data = input.nextInt();
                add(data);
                size++;
                continue;
            }   
            if(num==2){
                int data = input.nextInt();
                remove(data);
                continue;
            }
            if(num==3){
                System.out.println(array[0]);
            }
        }
    }
}