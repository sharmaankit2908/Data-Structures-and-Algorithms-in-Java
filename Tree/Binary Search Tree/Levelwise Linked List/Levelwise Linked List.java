import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */

	public static LinkedListNode<Integer> create_linked_List(ArrayList<Integer> list){
		int n=list.size();
		if (n==0){
			return null;
		}
		LinkedListNode<Integer> head=new LinkedListNode<Integer>(list.get(0));
		LinkedListNode<Integer> temp=head;
		for (int i=1;i<n;i++){
			LinkedListNode<Integer> newnode=new LinkedListNode<Integer>(list.get(i));
			temp.next=newnode;
			temp=temp.next;
		}
		return head;
	}
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here

		if (root==null){
			return null;
		}
		ArrayList<LinkedListNode<Integer>> ans= new ArrayList<>();
		Queue<BinaryTreeNode<Integer>> q1= new LinkedList<BinaryTreeNode<Integer>>();
		q1.add(root);
		Queue<BinaryTreeNode<Integer>> q2= new LinkedList<BinaryTreeNode<Integer>>();

		while (!q1.isEmpty() || !q1.isEmpty()){
			ArrayList<Integer> a1=new ArrayList<>();
			while (!q1.isEmpty()){
				BinaryTreeNode<Integer> front=q1.poll();
				a1.add(front.data);
				if (front.left !=null){
					q2.add(front.left);
				}
				if (front.right !=null){
					q2.add(front.right);
				}
			}
			ans.add(create_linked_List(a1));

			ArrayList<Integer> a2=new ArrayList<>();
			while (!q2.isEmpty()){
				BinaryTreeNode<Integer> front=q2.poll();
				a2.add(front.data);
				
				if (front.left !=null){
					q1.add(front.left);
				}
				if (front.right !=null){
					q1.add(front.right);
				}
			}
			ans.add(create_linked_List(a2));
		}
		return ans;

	}

}