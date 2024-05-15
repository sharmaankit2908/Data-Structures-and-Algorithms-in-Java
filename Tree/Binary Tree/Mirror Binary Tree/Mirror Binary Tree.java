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

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if ((root==null) ||(root.left==null && root.right==null)){
			return;
		}
		BinaryTreeNode<Integer> f=root.left;
		root.left=root.right;
		root.right=f;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
	}
	
}