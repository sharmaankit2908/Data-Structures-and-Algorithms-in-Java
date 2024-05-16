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
	public static int height(BinaryTreeNode<Integer> root){
		if (root==null){
			return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));	
	}
	public static boolean checkBST(BinaryTreeNode<Integer> root, int minrange, int maxrange){
		if(root == null){
			return true;
		}
		if (root.data<minrange || root.data>maxrange){
			return false;
		}
		boolean isleftwithinrange=checkBST(root.left, minrange, root.data-1);
		boolean isrightwithinrange=checkBST(root.right, root.data, maxrange);
		return isleftwithinrange && isrightwithinrange;
	}
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if (root==null){
			return 0;
		}
		if (root.left==null && root.right==null){
			return 1;
		}
		int h=height(root);
		int minrange=Integer.MIN_VALUE;
		int maxrange=Integer.MAX_VALUE;
		boolean check=checkBST(root, minrange, maxrange);
		if (check){
			return h;
		}
		int left=largestBSTSubtree(root.left);
		int right=largestBSTSubtree(root.right);
		return Math.max(left,right);
	
	}

}