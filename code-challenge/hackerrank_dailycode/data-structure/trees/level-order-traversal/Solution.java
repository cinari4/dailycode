   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
void LevelOrder(Node root) {
    Queue<Node> queue = new LinkedList<Node>();
    StringBuilder sb = new StringBuilder();

    queue.offer(root);
    while (!queue.isEmpty()) {
        Node tmpNode = queue.poll(); 
        sb.append(tmpNode.data + " ");

        if (tmpNode.left != null) {
            queue.offer(tmpNode.left);
        }

        if (tmpNode.right != null) {
            queue.offer(tmpNode.right);
        }
    }

    System.out.print(sb.toString());
}
