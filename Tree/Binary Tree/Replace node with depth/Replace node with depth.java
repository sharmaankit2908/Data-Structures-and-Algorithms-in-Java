/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.Queue;
import java.util.LinkedList;
public class Solution {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		if (root==null){
			return;
		}
		Queue<BinaryTreeNode<Integer>> q1= new LinkedList<BinaryTreeNode<Integer>>();
		q1.add(root);
		Queue<BinaryTreeNode<Integer>> q2= new LinkedList<BinaryTreeNode<Integer>>();
		int count=-1;

		while (!q1.isEmpty() || !q1.isEmpty()){

			count++;
			while (!q1.isEmpty()){
				BinaryTreeNode<Integer> front=q1.poll();
				front.data=count;
				
				if (front.left !=null){
					q2.add(front.left);
				}
				if (front.right !=null){
					q2.add(front.right);
				}
			}
			count++;
			while (!q2.isEmpty()){
				BinaryTreeNode<Integer> front=q2.poll();
				front.data=count;
				
				if (front.left !=null){
					q1.add(front.left);
				}
				if (front.right !=null){
					q1.add(front.right);
				}
			}
		}
		

	}

}