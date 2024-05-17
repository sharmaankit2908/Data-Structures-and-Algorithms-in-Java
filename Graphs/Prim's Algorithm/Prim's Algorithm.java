import java.util.Scanner;
class Edge{
	int v1;
	int v2;
	int weight;
	public Edge(int v1, int v2, int weight){
		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}
}
public class Solution {
	public static Edge[] PrimAlgorithm(int n, int[][] adjacency_matrix){
		Edge[] mst=new Edge[n-1];
		boolean visited[]=new boolean[n];
		int parent[]=new int[n];
		int vertex[]=new int[n];
		for (int i=0;i<n;i++){
			vertex[i]=i;
		}
		int weight[]=new int[n];
		int m=Integer.MAX_VALUE;
		for (int i=0;i<n;i++){
			weight[i]=m;
			parent[i]=-1;
		}
		weight[0]=0;

		for (int j=0;j<n-1;j++){
			// find vertex of minimum weight
			int min=Integer.MAX_VALUE;
			int vertex_min_weight=-1;
			for (int i=0;i<n;i++){
				if (!visited[i] && weight[i]<min){
					min=weight[i];
					vertex_min_weight=i;
				}
			}
			visited[vertex_min_weight]=true;
			for (int i=0;i<n;i++){
				if (i==vertex_min_weight){
					continue;
				}
				if (adjacency_matrix[vertex_min_weight][i] !=0 && !visited[i]){
					
					if (adjacency_matrix[vertex_min_weight][i] < weight[i]){
						parent[i]=vertex_min_weight;
						weight[i]=adjacency_matrix[vertex_min_weight][i];
					}		
				}
			}
		}
		for (int i=1;i<n;i++){
			Edge e=new Edge(vertex[i], parent[i], weight[i]);
			mst[i-1]=e;
		}
		return mst;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		int[][] adjacency_matrix=new int[V][V];
		
		for (int i=0;i<E;i++){
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			adjacency_matrix[v1][v2]=weight;
			adjacency_matrix[v2][v1]=weight;
		}

		Edge mst[]=PrimAlgorithm(V,adjacency_matrix);

		for(int i = 0; i < mst.length; i++){ 
			
			if(mst[i].v1 < mst[i].v2){
				System.out.println(mst[i].v1 +" "+ mst[i].v2 +" " + mst[i].weight); 
			}
			else{
				System.out.println(mst[i].v2 +" "+ mst[i].v1 +"  " + mst[i].weight);
			}
		}
	}
}