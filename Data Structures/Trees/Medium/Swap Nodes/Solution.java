import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Node{
        int index;
        int depth;
        int leftchild;
        int rightchild;
        
        public Node(int index){
            this.index = index;
            this.depth = 1;
            this.leftchild = -1;
            this.rightchild = -1;
        }
    }
    
    private static void inOrder(Node [] tree, int index){
        if(index==-2){
            return;
        }
        inOrder(tree,tree[index].leftchild);
        System.out.print(index+1 + " ");
        inOrder(tree,tree[index].rightchild);
    }
    
    private static void swapNodes(Node [] tree, int k,int index){
        if(index==-2){
            return;
        }
        swapNodes(tree,k,tree[index].leftchild);
        swapNodes(tree,k,tree[index].rightchild);
        if(tree[index].depth%k==0){
            int temp = tree[index].leftchild;
            tree[index].leftchild = tree[index].rightchild;
            tree[index].rightchild = temp;
        }
    }
    
    private static Node [] initialize(int n){
        Node [] tree = new Node[n];
        for(int i=0;i<n;i++){
            tree[i] = new Node(i);
        }
        return tree;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node [] tree = initialize(n);
        for(int i=0;i<n;i++){
            int left  = input.nextInt()-1;
            int right = input.nextInt()-1;
            tree[i].leftchild = left;
            tree[i].rightchild = right;
            if(left!=-2){
                tree[left].depth = tree[i].depth+1;    
            }
            if(right!=-2){
                tree[right].depth = tree[i].depth+1;    
            }
        }
        
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int k = input.nextInt();
            swapNodes(tree,k,0);
            inOrder(tree,0);
            System.out.println();
        }
    }
}