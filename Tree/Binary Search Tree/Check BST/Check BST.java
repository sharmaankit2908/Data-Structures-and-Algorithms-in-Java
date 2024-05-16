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
	public static int maxvalue(BinaryTreeNode<Integer> root){
		if (root==null){
			return Integer.MIN_VALUE;
		}
		return (Math.max(root.data,Math.max(maxvalue(root.left),maxvalue(root.right))));

	}
	public static int minvalue(BinaryTreeNode<Integer> root){
		if (root==null){
			return Integer.MAX_VALUE;
		}
		return (Math.min(root.data,Math.min(minvalue(root.left),minvalue(root.right))));

	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if (root==null){
			return true;
		}
		else if (root.left==null && root.right==null){
			return true;
		}
		boolean b1=true;
		if ((root.left !=null) && (root.data < maxvalue(root.left))){
			b1=false;
		}
		boolean b2=true;
		if ((root.right !=null) && (root.data > minvalue(root.right))){
			b2=false;
		}
		boolean smallans=(b1&&b2);
		boolean left=isBST(root.left);
		boolean right=isBST(root.right);

		return (smallans&&left)&&right;

	}

}