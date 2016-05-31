/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    
    Node node = head;
    Stack st = new Stack();
    while (node != null) {
        st.push(node.data);
        node = node.next;
    }
    
    int result = 0;
    for (int i=0; i<=n; i++) {
        if (!st.isEmpty()) {
            result = (int)st.pop(); 
        } else {
            return result;
        }
    }
    
    return result;
}