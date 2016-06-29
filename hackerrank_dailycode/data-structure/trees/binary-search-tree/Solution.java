/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
	Node newNode = new Node();
	newNode.data = value;
	newNode.left = null;
	newNode.right = null;

	if (root == null) {
		return newNode;
	}

	Node tmpNode = root;
	Node leftNode = null;
	Node rightNode = null;

	while (tmpNode != null) {
		if (tmpNode.data > value) {
			if (tmpNode.left == null) {
				tmpNode.left = newNode;
				return root;
			}
			tmpNode = tmpNode.left;
		} else {
			if (tmpNode.right == null) {
				tmpNode.right = newNode;
				return root;
			}

			tmpNode = tmpNode.right;
		}

	}
    return root;
}
