import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	static ArrayList<Integer> ans;
	static HashMap<Integer,Integer> map;
	public static void PrintPath(int[][] adjacency_matrix,int start_vertex, int end_vertex){
		int n=adjacency_matrix.length;
		boolean[] visited=new boolean[n];
		visited[start_vertex]=true;	
		Queue<Integer> q=new LinkedList<>();
		q.add(start_vertex);
		map.put(start_vertex,-1);
		while(!q.isEmpty()){
			int current=q.poll();
			if (current==end_vertex){
				ans.add(current);
				int parent=map.get(current);
				while (parent !=-1){
					ans.add(parent);
					parent=map.get(parent);
				}
				break;
			}
			for (int i=0;i<n;i++){
				if (adjacency_matrix[current][i]==1 && !visited[i]){
					q.add(i);
					map.put(i,current);
					visited[i]=true;
				}
			}
		}
	}
	public static boolean isPathExist(int[][] adjacency_matrix,int start_vertex, int end_vertex){
		int n=adjacency_matrix.length;
		boolean[] visited=new boolean[n];
		visited[start_vertex]=true;
		Queue<Integer> q=new LinkedList<>();
		q.add(start_vertex);
		while(!q.isEmpty()){
			int current=q.poll();
			if (current==end_vertex){
				return true;
			}
			for (int i=0;i<n;i++){
				if (adjacency_matrix[current][i]==1 && !visited[i]){
					q.add(i);
					visited[i]=true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int[][] adjacency_matrix=new int[v][v];
		for (int i=0;i<e;i++){
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjacency_matrix[v1][v2]=1;
			adjacency_matrix[v2][v1]=1;
		}
		int start_vertex=sc.nextInt();
		int end_vertex=sc.nextInt();

		if (start_vertex==end_vertex){
			System.out.println(start_vertex);
			return;
		}
		boolean pathexist=isPathExist(adjacency_matrix, start_vertex,end_vertex);
		if (pathexist){
			ans=new ArrayList<>();
			map=new HashMap<>();
			PrintPath(adjacency_matrix, start_vertex, end_vertex);
			for (int i=0;i<ans.size();i++){
				System.out.print(ans.get(i)+" ");
			}
		}
	}
}