import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	public static void bfs(int[][] adjacency_matrix, int[] visited){
		int n=adjacency_matrix.length;
		Queue<Integer> q;
		for (int i=0;i<n;i++){
			if (visited[i]==0){
				q=new LinkedList<>();
				q.add(i);	
				visited[i]=1;
				while (!q.isEmpty()){
					int current=q.poll();
					System.out.print(current+" ");
					for (int j=0;j<n;j++){
						if (adjacency_matrix[current][j]==1 && visited[j]==0){
							q.add(j);
							visited[j]=1;
						}
					}
				}
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
		int e=sc.nextInt();
		int[][] adjacency_matrix=new int[v][v];
		for (int i=0;i<e;i++){
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjacency_matrix[v1][v2]=1;
			adjacency_matrix[v2][v1]=1;
		}
		if (v==0){
			return;
		}
		int[] visited=new int[v];
		bfs(adjacency_matrix,visited);
	}

}