/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    // This is a "method-only" submission. 
    // You only need to complete this method.
    if (head == null) {
        return;
    }
    
    Node node = head;
    Stack st = new Stack();
    while (node != null) {
        st.push(node.data);
        node = node.next;
    }
    
    while (!st.isEmpty()) {
        System.out.println(st.pop());
    }
}
