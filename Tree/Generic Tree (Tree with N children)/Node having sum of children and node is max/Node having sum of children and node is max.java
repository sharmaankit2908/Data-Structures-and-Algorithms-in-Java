
public class Solution {
	public static class pair{
		int sum;
		TreeNode<Integer> root;
	}

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
	public static pair maxSum(TreeNode<Integer> root){
		
		pair ans=new pair();
		ans.sum=0;
		ans.root=null;
		if (root==null){
			return ans;
		}
		int s1=root.data;
		for (int i=0;i<root.children.size();i++){
			s1 +=root.children.get(i).data;
		}
		ans.sum=s1;
		ans.root=root;

		for (int i=0;i<root.children.size();i++){
			pair p=maxSum(root.children.get(i));
			if (p.sum > ans.sum){
				ans.sum=p.sum;
				ans.root=p.root;
			}
		}
		return ans;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		pair ans=maxSum(root);
		return ans.root;
	}
	
		
}
