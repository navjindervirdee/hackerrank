/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    List<Node> visited = new ArrayList<Node>();
    if(head==null){
        return false;
    }
    Node temp = head;
    while(temp!=null){
        if(visited.contains(temp)){
            return true;
        }
        visited.add(temp);
        temp = temp.next;
    }
    return false; 
}
