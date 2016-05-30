/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
    Node nodeA = headA;
    Node nodeB = headB;
    Node result = null;
    Node resultPtr = null;
    
    while (true) {
        if (nodeA == null && nodeB == null) {
            break;
        }
        
        Node tmpNode = new Node();
        if (nodeA == null) {
            tmpNode.data = nodeB.data;
            tmpNode.next = null;
            
            nodeB = nodeB.next;
        } else if (nodeB == null) {
            tmpNode.data = nodeA.data;
            tmpNode.next = null;
            
            nodeA = nodeA.next;
        } else if (nodeA.data <= nodeB.data) {
            tmpNode.data = nodeA.data;
            tmpNode.next = null;
            
            nodeA = nodeA.next;
        } else {
            tmpNode.data = nodeB.data;
            tmpNode.next = null;
            
            nodeB = nodeB.next;
        }
        
        if (result == null) {
            result = tmpNode;
            resultPtr = tmpNode;
        } else {
            resultPtr.next = tmpNode;
            resultPtr = resultPtr.next;
        }
    }
    
    return result;
}
