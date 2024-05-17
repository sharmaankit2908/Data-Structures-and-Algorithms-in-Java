import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.io.IOException;

public class Solution {
	static boolean visited[];
	public static void dfs(int[][] adjacency_matrix, int start_index,int n){
		visited[start_index]=true;
		for(int i=0;i<n;i++){
			if (adjacency_matrix[start_index][i]==1 && !visited[i]){
				dfs(adjacency_matrix,i,n);
			}
		}		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		java.util.Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=v;
		if (n==0){
			System.out.println("true");
			return;
		}

		int e=sc.nextInt();
		if (e==0 && n>1){
			System.out.println("false");
			return;
		}
		int[][] adjacency_matrix=new int[v][v];
		for (int i=0;i<e;i++){
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjacency_matrix[v1][v2]=1;
			adjacency_matrix[v2][v1]=1;
		}
		visited=new boolean[n];
		dfs(adjacency_matrix,0,n);
		for (int i=0;i<n;i++){
			if (visited[i]==false){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");

	}

}