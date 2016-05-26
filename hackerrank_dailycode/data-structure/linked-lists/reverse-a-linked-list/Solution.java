/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    
    Node node = head;
    Stack st = new Stack();
    while (node != null) {
        st.push(node.data);
        node = node.next;
    }
    
    Node reverseNode = new Node();
    reverseNode.data = (int)st.pop();
    reverseNode.next = null; 
    Node headReverseNode = reverseNode;
    
    while (!st.isEmpty()) {
        Node tmpNode = new Node();
        tmpNode.data = (int)st.pop();
        tmpNode.next = null;
        
        reverseNode.next = tmpNode;
        reverseNode = tmpNode;
    }

    return headReverseNode; 
}
