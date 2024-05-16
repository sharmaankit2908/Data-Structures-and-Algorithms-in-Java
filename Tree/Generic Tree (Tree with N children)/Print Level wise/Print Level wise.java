import java.util.LinkedList;
import java.util.Queue;

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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		if (root==null){
			return;
		}
		Queue<TreeNode<Integer>> q1=new LinkedList<TreeNode<Integer>>();
		Queue<TreeNode<Integer>> q2=new LinkedList<TreeNode<Integer>>();
		q1.add(root);

		while (!q1.isEmpty() || !q2.isEmpty()){
			while (!q1.isEmpty()){
				TreeNode<Integer> front=q1.poll();
				for (int i=0;i<front.children.size();i++){
					q2.add(front.children.get(i));
				}
				System.out.print(front.data+" ");
			}
			System.out.println();

			while (!q2.isEmpty()){
				TreeNode<Integer> front=q2.poll();
				for (int i=0;i<front.children.size();i++){
					q1.add(front.children.get(i));
				}
				System.out.print(front.data+" ");
			}
			System.out.println();
		}
	}
		
}
