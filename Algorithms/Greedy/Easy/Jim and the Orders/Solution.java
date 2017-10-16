import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Order{
        int ordernum;
        int placetime;
        int delivertime;
        
        public Order(int ordernum, int placetime,int delivertime){
            this.ordernum = ordernum;
            this.placetime = placetime;
            this.delivertime = delivertime;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Order> list = new ArrayList<Order>();
        for(int i=0;i<n;i++){
            Order order = new Order(i,input.nextInt(),input.nextInt());
            list.add(order);
        }
        
        Collections.sort(list,new Comparator<Order>(){
            public int compare(Order o1,Order o2){
                int total1 = o1.placetime + o1.delivertime;
                int total2 = o2.placetime + o2.delivertime;
                if(total1>total2){
                    return 1;
                }
                if(total1<total2){
                    return -1;
                }
                else{
                    if(o1.ordernum>o2.ordernum){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
            }
        });
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).ordernum+1 + " ");
        }
        System.out.println();
    }
    
}