public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		public static BinaryTreeNode<Integer> helperSortedArrayToBST(int[] arr,int si,int ei){
			if(si>ei){
				return null;
			}
			
			int mid=(ei+si)/2;
			BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[mid]);
			root.left=helperSortedArrayToBST(arr, si, mid-1);
			root.right=helperSortedArrayToBST(arr,mid+1, ei);
			return root;
		}
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return helperSortedArrayToBST(arr, 0, n-1);

			
		}
	}