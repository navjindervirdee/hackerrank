/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    List<Integer> list;
    void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }

    boolean checkBST(Node root) {
        list = new ArrayList<Integer>();
        inOrder(root);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }
