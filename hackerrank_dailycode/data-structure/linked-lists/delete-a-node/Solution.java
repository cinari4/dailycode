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

Node Delete(Node head, int position) {

    if (position == 0) {
        return head.next;
    }
       
    Node node = head.next;
    Node preNode = head;
    for (int i = 0; i < position-1; i++) {
        node = node.next;
        preNode = preNode.next;
    }
    
    if (node.next == null) {
        preNode.next = null;    
    } else {
        preNode.next = node.next;
    }
    
    return head;
}