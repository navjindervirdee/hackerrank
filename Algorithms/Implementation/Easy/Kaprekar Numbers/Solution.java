import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        boolean found = false;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=p;i<=q;i++){
            String num = Integer.toString(i);
            long square = (long)Math.pow(i,2);
            String sq = Long.toString(square);
            String l = sq.substring(0,sq.length()/2);
            String r = sq.substring(sq.length()/2);
            if(r.length()==0 || l.length()==0){
                if(r.length()==0){
                    int left = Integer.parseInt(l);
                    if(left==i){
                        list.add(i);
                    }
                }
                else{
                    int right = Integer.parseInt(r);
                    if(right==i){
                        list.add(i);
                    }
                }
            }
            else{
                int right = Integer.parseInt(r);
                int left = Integer.parseInt(l);
                if(right==0 || left==0){
                    if(right==0){
                        if(left==i){
                            list.add(i);
                        }
                    }
                    else{
                        if(right==i){
                            list.add(i);
                        }
                    }
                }
                else{
                    if(right+left==i){
                        list.add(i);
                    }
                }
            }
        }
        if(list.size()==0){
            System.out.println("INVALID RANGE");
        }
        else{
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }
        }
    }
}