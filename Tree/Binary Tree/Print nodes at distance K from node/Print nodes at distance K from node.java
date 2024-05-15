
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
	public static void printkdistanceNodesDown(BinaryTreeNode<Integer> root,int k){
		if ((root==null) || k<0){
			return;
		}
		if (k==0){
			System.out.println(root.data+" ");
			return;
		}
		printkdistanceNodesDown(root.left,k-1);
		printkdistanceNodesDown(root.right,k-1);
	
	}

	public static int nodesAtDistance_K(BinaryTreeNode<Integer> root, int node, int k){
		if (root==null){
			return -1;
		}
		if (root.data==node){
			printkdistanceNodesDown(root,k);
			return 0;
		}

		int dl=nodesAtDistance_K(root.left, node, k);

		if (dl !=-1){
			if (dl+1==k){
				System.out.println(root.data+" ");
			}
			else{
				printkdistanceNodesDown(root.right, k-dl-2);
			}
			return 1+dl;
		}

		int dr=nodesAtDistance_K(root.right, node, k);

		if (dr != -1){
			if (dr+1==k){
				System.out.println(root.data+" ");
			}
			else{
				printkdistanceNodesDown(root.left, k-dr-2);
			}
			return 1+dr;
		}

		return -1;

	}
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
		nodesAtDistance_K(root, node, k);

	}

}