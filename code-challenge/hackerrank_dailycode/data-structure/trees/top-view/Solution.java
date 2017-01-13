/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root) {
    Stack leftStack = new Stack();
    Node tmpNode = root;
    
    while (tmpNode != null) {
        leftStack.push(tmpNode.data);
        tmpNode = tmpNode.left;
    }
    
    StringBuilder sb = new StringBuilder();
    while (!leftStack.isEmpty()) {
        sb.append(leftStack.pop() + " ");
    }
    
    tmpNode = root;
    while (tmpNode != null) {
        if (tmpNode == root) {
            tmpNode = tmpNode.right;
            continue;
        }
        sb.append(tmpNode.data + " ");
        tmpNode = tmpNode.right;
    }

    System.out.println(sb.toString());
}
