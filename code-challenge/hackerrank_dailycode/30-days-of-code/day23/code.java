import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root) {
		if(root==null)
			return;
		
		Queue queue = new LinkedList();
		queue.offer(root);
		while(queue != null) {
			Node node = (Node)queue.poll();
			if(node == null)
				return;
			System.out.print(node.data + " ");
			if(node.left != null)
				queue.offer(node.left);
			if(node.right != null)
				queue.offer(node.right);
		}
	}

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}