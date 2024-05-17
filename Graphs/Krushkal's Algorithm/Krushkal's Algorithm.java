import java.util.Scanner;
import java.util.*;
class edge implements Comparable<edge>{
	int start_vertex;
	int end_vertex;
	int weight;

	edge(int start_vertex, int end_vertex, int weight){
		this.start_vertex=start_vertex;
		this.end_vertex=end_vertex;
		this.weight=weight;
	}

	@Override
	public int compareTo(edge o) {
		return this.weight - o.weight;
	}
}
public class Solution {
	private static int findparent( int parent[], int v) {
		if(v == parent[v]){
		return v;
		}
		return findparent(parent,parent[v]);
	}
	public static edge[] Kruskal_Algorithm(edge[] edges, int n){
			
		Arrays.sort(edges); 
		edge[] mst=new edge[n-1];
		int count =0;
		int[] parent=new int[n];

		for (int i=0;i<n;i++){
			parent[i]=i;
		}
		// int count=0;
		int i=0;
		while(count <n-1){
			edge currentedge=edges[i++];
			int v1parent=findparent(parent, currentedge.start_vertex);
			int v2parent=findparent(parent, currentedge.end_vertex);
			if (v1parent !=v2parent){
				mst[count++]=currentedge;
				parent[v1parent]=v2parent;
			}
			
		}
		return mst;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		edge[] graph=new edge[E];
		for (int i=0;i<E;i++){
			int start=sc.nextInt();
			int end=sc.nextInt();
			int weight=sc.nextInt();
			edge e=new edge(start, end, weight);
			graph[i]=e;
		}
		edge[] mst=Kruskal_Algorithm(graph,V);
		
		for(int i = 0; i < mst.length; i++){ 
			if(mst[i].start_vertex < mst[i].end_vertex){
				System.out.println(mst[i].start_vertex +" "+ mst[i].end_vertex +" " + mst[i].weight); 
			}
			else{
				System.out.println(mst[i].end_vertex +" "+ mst[i].start_vertex +"  " + mst[i].weight);
			}
		}
	}
}