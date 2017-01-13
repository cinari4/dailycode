/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    if (head == null) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }
    
    if (head.next == null) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        head.next = node;
    } else {
        Insert(head.next, data);
    }
    
    return head;
}
