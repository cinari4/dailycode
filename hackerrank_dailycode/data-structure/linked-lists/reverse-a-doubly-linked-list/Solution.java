/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
	Node ptrNode = head;
	// check head is null
	if (ptrNode == null) {
		return null;
	}

	Stack<Integer> st = new Stack<Integer>();
	// put node in stack
	while (ptrNode.next != null) {
		st.push(ptrNode.data);
		ptrNode = ptrNode.next;
	}	
		
	Node retHead = new Node();
	retHead.data = ptrNode.data;
	retHead.prev = ptrNode.next;
	retHead.next = ptrNode.prev;
	ptrNode = retHead;

	while (!st.isEmpty()) {
		Node tmpNode = new Node();
		tmpNode.data = (int)st.pop();
		tmpNode.prev = ptrNode;
		tmpNode.next = null;
		ptrNode.next = tmpNode;

		ptrNode = tmpNode;
	}

	return retHead;
}
