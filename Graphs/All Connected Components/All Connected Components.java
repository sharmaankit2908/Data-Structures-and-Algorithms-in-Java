import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Solution {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> final_ans=new ArrayList<>();

	public static void dfs(int[][] adjacency_matrix, int start_index,int n,ArrayList<Integer> ans){
		visited[start_index]=true;
		ans.add(start_index);
		for(int i=0;i<n;i++){
			if (adjacency_matrix[start_index][i]==1 && !visited[i]){
				dfs(adjacency_matrix,i,n,ans);
			}
		}		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=v;
		int e=sc.nextInt();
		int[][] adjacency_matrix=new int[v][v];
		for (int i=0;i<e;i++){
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjacency_matrix[v1][v2]=1;
			adjacency_matrix[v2][v1]=1;
		}
		visited=new boolean[n];
		ArrayList<Integer> ans;
		
		for (int i=0;i<n;i++){
			if (visited[i]==false){
				ans=new ArrayList<>();
				dfs(adjacency_matrix, i, n, ans);
				Collections.sort(ans);
				for (int j=0;j<ans.size();j++){
					System.out.print(ans.get(j)+" ");
				}
				System.out.println();
			}
		}
	}
}