/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
	// Complete this function
	// Do not write the main method. 
	Node nodeA = headA;
	Node nodeB = headB;

	if (headA == null || headB == null) {
		return 0;
	}

	Stack stA = new Stack();
	while (nodeA != null) {
		stA.push(nodeA.data);
		nodeA = nodeA.next;
    }

	Stack stB = new Stack();
	while (nodeB != null) {
		stB.push(nodeB.data);
		nodeB = nodeB.next;
    }

    int point = 0;
    while (!stA.isEmpty() || !stA.isEmpty()) {
    	int tmpA = (int)stA.pop();
    	int tmpB = (int)stB.pop();
    	if (tmpA == tmpB) {
    		point = tmpA;
    	} else {
    		return point;
    	}
    }

    return point;
}
