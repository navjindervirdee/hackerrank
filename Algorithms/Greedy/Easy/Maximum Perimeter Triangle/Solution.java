import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        
        Collections.sort(list);
        int i = n-3;
        while(i>=0){
            if(list.get(i)+list.get(i+1)>list.get(i+2)){
                break;
            }
            i--;
        }
        if(i==-1){
            System.out.println(-1);
        }
        else{
            System.out.println(list.get(i) + " " + list.get(i+1) + " " + list.get(i+2));
        }
    }
}