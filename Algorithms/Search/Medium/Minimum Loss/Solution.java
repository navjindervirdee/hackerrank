import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class House{
        int year;
        long price;
        
        public House(int year, long price){
            this.year = year;
            this.price = price;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        List<House> list = new ArrayList<House>();
        String [] s = input.nextLine().trim().split(" ");
        for(int i=0;i<n;i++){
            list.add(new House(i,Long.parseLong(s[i])));
        }
        Collections.sort(list, new Comparator<House>(){
            public int compare(House h1, House h2){
                if(h1.price>h2.price){
                    return 1;
                }
                if(h1.price<h2.price){
                    return -1;
                }
                return 0;
            }
        });
        
        long min = 100000000;
        for(int i=0;i<list.size()-1;i++){
            House h1 = list.get(i);
            House h2 = list.get(i+1);
            long diff = Math.abs(h1.price-h2.price);
            if(min>diff){
                if(h1.year<h2.year && h1.price>h2.price){
                    min = diff;
                    continue;
                }
                if(h1.year>h2.year && h2.price>h1.price){
                    min = diff;
                    continue;
                }
            }
        }
        System.out.println(min);
    }
}