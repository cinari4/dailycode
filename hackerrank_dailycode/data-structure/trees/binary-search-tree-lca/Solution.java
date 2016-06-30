/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
*/

static Node lca(Node root,int v1,int v2) {
    Queue<Node> v1Queue = new LinkedList<Node>();
    Queue<Node> v2Queue = new LinkedList<Node>();

    // find and push v1 path
    Node tmpNode = root;
    while (tmpNode != null) {
        v1Queue.offer(tmpNode);
        if (tmpNode.data > v1) {
            tmpNode = tmpNode.left;
        } else if (tmpNode.data < v1) {
            tmpNode = tmpNode.right;
        } else {
            break;
        }
    }

    // find and push v2 path
    tmpNode = root;
    while (tmpNode != null) {
        v2Queue.offer(tmpNode);
        if (tmpNode.data > v2) {
            tmpNode = tmpNode.left;
        } else if (tmpNode.data < v2) {
            tmpNode = tmpNode.right;
        } else {
            break;
        }
    }

    Node retNode = null;
    while (!v1Queue.isEmpty()) {
        if(v1Queue.peek().data != v2Queue.peek().data) {
            break;
        } else {
            retNode = v1Queue.remove();
            v2Queue.remove();
        }

    }
    return retNode;
}
