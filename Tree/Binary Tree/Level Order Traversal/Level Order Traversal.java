import java.util.Queue;
import java.util.LinkedList;

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

public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root==null){
			return;
		}
		Queue<BinaryTreeNode<Integer>> q1=new LinkedList<BinaryTreeNode<Integer>>();
		Queue<BinaryTreeNode<Integer>> q2=new LinkedList<BinaryTreeNode<Integer>>();
		q1.add(root);

		while (!q1.isEmpty() || !q1.isEmpty()){
			while (!q1.isEmpty()){
				BinaryTreeNode<Integer> front=q1.poll();
				if (front.left !=null){
					q2.add(front.left);
				}
				if (front.right !=null){
					q2.add(front.right);
				}
				System.out.print(front.data+" ");
			}
			System.out.println();
			while (!q2.isEmpty()){
				BinaryTreeNode<Integer> front=q2.poll();
				if (front.left !=null){
					q1.add(front.left);
				}
				if (front.right !=null){
					q1.add(front.right);
				}
				System.out.print(front.data+" ");
			}
			System.out.println();
		}

	}
	
}