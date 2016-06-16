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
    // if last node return the node
    if (head == null || head.next == null) {
        return head;
    }
    
    // get next node;
    Node nextNode = head.next;
    head.next = null;
    
    // get before node
    Node newHead = Reverse(nextNode);
    
    nextNode.next = head;
    return newHead;
}
