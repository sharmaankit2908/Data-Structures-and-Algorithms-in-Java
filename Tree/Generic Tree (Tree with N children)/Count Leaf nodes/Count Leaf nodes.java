public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if (root==null){
			return 0;
		}
		int n=root.children.size();
		if (n==0){
			return 1;
		}
		else{
			int ans=0;
			for (int i=0;i<n;i++){
				ans +=countLeafNodes(root.children.get(i));
			}
			return ans;
		}

	}
	
}
