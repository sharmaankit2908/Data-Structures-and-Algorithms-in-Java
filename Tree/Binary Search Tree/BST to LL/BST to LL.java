import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
	 public static LinkedListNode<Integer> addNode (BinaryTreeNode<Integer> currentBSTnode, LinkedListNode<Integer> currentLLnode){
		 LinkedListNode<Integer>  newnode=new LinkedListNode<Integer> (currentBSTnode.data);
		 currentLLnode.next=newnode;
		 return newnode;
	 }


	 public static LinkedListNode<Integer> helper (BinaryTreeNode<Integer> currentBSTnode, LinkedListNode<Integer> currentLLnode){
		 if (currentBSTnode==null){
			 return currentLLnode;
		 }
		 if (currentBSTnode.left !=null){
			 currentLLnode=helper(currentBSTnode.left, currentLLnode);		
		 }
		 currentLLnode=addNode(currentBSTnode,currentLLnode);

		 if (currentBSTnode.right !=null){
			 currentLLnode=helper(currentBSTnode.right, currentLLnode);		
		 }
		 return currentLLnode;
	 }
	 
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if (root==null){
			return null;
		}
		LinkedListNode<Integer> head=new LinkedListNode<Integer>(root.data);
		helper(root,head);
		return head.next;
	}
}