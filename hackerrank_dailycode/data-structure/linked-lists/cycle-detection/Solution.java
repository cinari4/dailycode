/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    // Complete this function
    // Do not write the main method
    if (head == null) {
        return false;
    }
    if (head == head.next) {
        return true;
    }

    Set<Node> set = new HashSet<Node>();
    Node node = head;
    int cnt = 0;

    while (node != null) {
        if (set.contains(node)) {
            return true;
        }
        set.add(node);
        cnt++;
        node = node.next;
    }

    if (set.size() != cnt) {
        return true;
    }
    return false;
}
