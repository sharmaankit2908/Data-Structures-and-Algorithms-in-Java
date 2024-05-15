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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {
	public static int maximum_(BinaryTreeNode<Integer> root){
		if (root==null){
			return 0;
		}
		if (root.left==null && root.right==null){
			return root.data;
		}
		return Math.max(root.data,Math.max(maximum_(root.left),maximum_(root.right)));

	}

	public static int minimum_(BinaryTreeNode<Integer> root){
		if (root==null){
			return Integer.MAX_VALUE;
		}
		if (root.left==null && root.right==null){
			return root.data;
		}
		return Math.min(root.data,Math.min(minimum_(root.left),minimum_(root.right)));

	}
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		 Pair<Integer, Integer> ans=new  Pair<Integer, Integer>(0,0);
		if (root==null){
			return ans;
		}
		ans.minimum=minimum_(root);
		ans.maximum=maximum_(root);
		return ans;
	}
	
}