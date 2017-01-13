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
    if(head == null) {
        head.data = data;
        head.next = null;
    } else {
        Node tmpNode = head;
        while(tmpNode.next != null) {
            tmpNode = tmpNode.next;    
        }
        Node node = new Node();
        node.data = data;
        node.next = null;

        tmpNode.next = node;
    }
    return head;
}
