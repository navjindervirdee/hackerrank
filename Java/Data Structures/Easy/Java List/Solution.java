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
        int q = input.nextInt();
        for(int i=0;i<q;i++){
            input.nextLine();
            String s = input.nextLine().trim();
            if(s.equals("Insert")){
                list.add(input.nextInt(),input.nextInt());
            }
            else{
                list.remove(input.nextInt());
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
