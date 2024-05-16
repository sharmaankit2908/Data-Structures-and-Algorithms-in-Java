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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
		if (root1==null && root2==null){
			return true;
		}
		else if (root1==null && root2 !=null){
			return false;

		}
		else if (root1 !=null && root2==null){
			return false;
			
		}
		else{
			boolean b1=(root1.data==root2.data);
			int n1=root1.children.size();
			int n2=root2.children.size();
			if (n1 !=n2){
				return false;
			}
			else{
				for (int i=0;i<n1;i++){
					boolean b2=(checkIdentical(root1.children.get(i), root2.children.get(i)));
					b1 =b1&&b2;
				}
				return b1;
			}
			
		}
	}
	
}
