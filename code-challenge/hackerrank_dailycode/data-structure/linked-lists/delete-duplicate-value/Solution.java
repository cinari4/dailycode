/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
    if (head == null) {
        return null;
    }
    
    Node node = head;
    while (node.next != null) {
        if (node.data == node.next.data) {
            node.next = node.next.next;
        } else {
            node = node.next;
        }
    }
    return head;
}
