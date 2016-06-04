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

Node SortedInsert(Node head,int data) {
	Node newNode = new Node();
	newNode.data = data;
	newNode.next = null;
	newNode.prev = null;

	if (head == null) {
		return newNode;
	}

	Node node = head;  
	while (node.next != null) {
		if (node.data > data) {
			newNode.next = node;
			newNode.prev = node.prev;
			newNode.prev.next = newNode;
			node.prev = newNode;
			return head;
		}
		node = node.next;
	}

	if (node.data > data) {
		newNode.next = node;
		newNode.prev = node.prev;
		newNode.prev.next = newNode;
		node.prev = newNode;
	} else {
		node.next = newNode;
		newNode.prev = node;
	}

	return head;
}
