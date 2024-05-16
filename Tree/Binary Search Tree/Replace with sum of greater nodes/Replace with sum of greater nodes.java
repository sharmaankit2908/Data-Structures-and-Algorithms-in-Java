public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */
	
	public static void helper(BinaryTreeNode<Integer> root,int total){
		if (root==null){
			return;
		}
		helper(root.right, total);
		total = total + root.data; 
		root.data = total;
		helper(root.left, total);

	}
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		if (root==null){
			return;
		}
		// int total[]=new int[1];
		helper(root, 0);

	}
}