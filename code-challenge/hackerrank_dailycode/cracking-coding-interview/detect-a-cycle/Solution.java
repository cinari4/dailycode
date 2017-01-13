/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<Node> hashSet = new HashSet<>();
    Node tmpNode = head;
    while (tmpNode != null) {
        if (hashSet.contains(tmpNode)) {
            return true;
        } else  {
            hashSet.add(tmpNode);
        }
        tmpNode = tmpNode.next;
    }
    return false;
}
