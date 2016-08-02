import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
	
}
class Solution
{

	public static Node removeDuplicates(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		
		Node tmp = head;
		while (tmp != null) {
			set.add(tmp.data);
			tmp = tmp.next;
		}
		
		Node retNode = null;
		Node retPtrNode = null;
		for (int data : set) {
			if( retNode == null) {
				retNode = new Node(data);
				retPtrNode = retNode;
			} else{
				Node tmpNode = new Node(data);
				retPtrNode.next = tmpNode;
				retPtrNode = tmpNode;
			}
			
		}
		return retNode;
	}
	
	public static  Node insert(Node head,int data)
	{
		Node p=new Node(data);
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
	public static void display(Node head)
		{
			Node start=head;
			while(start!=null)
			{
				System.out.print(start.data+" ");
				start=start.next;
			}
		}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		//display(head);
	}
}