import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    // static ArrayList<Integer> ans;

    // public static void dfs1(int[][] adjacency_matrix, boolean[] visited, int v1, int v2, int n) {
    //     visited[v1] = true;
    //     ans.add(v1);

    //     if (v1 == v2) {
    //         return;
    //     }

    //     for (int i = 0; i < n; i++) {
    //         if (adjacency_matrix[v1][i] == 1 && !visited[i]) {
    //             dfs1(adjacency_matrix, visited, i, v2, n);
    //             return;
    //         }
    //     }
    // }

    // public static boolean dfs(int[][] adjacency_matrix, boolean[] visited, int v1, int v2, int n) {
    //     if (v1 == v2) {
    //         return true;
    //     }

    //     visited[v1] = true;

    //     for (int i = 0; i < n; i++) {
    //         if (adjacency_matrix[v1][i] == 1 && !visited[i]) {
    //             if (dfs(adjacency_matrix, visited, i, v2, n)) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }



    public static ArrayList<Integer> getPathDFS(int[][] edges,boolean[] visited,int V1,int V2){
        if(V1==V2) 
        {
            ArrayList<Integer> ans=new ArrayList<>();
            visited[V1]=true;
            ans.add(V1);
            return ans;
        }
        visited[V1]=true;
        for(int i=0;i<edges.length;i++)
        {
            if(edges[V1][i]==1 && !visited[i])
            {   //here we are calling recursion for children of start to end.
                ArrayList<Integer> arr=getPathDFS(edges,visited,i,V2); 
                if(arr!=null)
                {
                    arr.add(V1);

                    return arr;
                }
            }
        }
        //if no naswer is found return null 
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] adjacency_matrix = new int[v][v];
        boolean[] visited = new boolean[v];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjacency_matrix[v1][v2] = 1;
            adjacency_matrix[v2][v1] = 1;
        }

        int startVertex = sc.nextInt();
        int endVertex = sc.nextInt();

        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }

        // boolean pathExists = dfs(adjacency_matrix, visited, startVertex, endVertex, v);
        // ans=new ArrayList<>();

        // if (pathExists) {
        //     dfs1(adjacency_matrix, new boolean[v], startVertex, endVertex, v);
        //     System.out.println();
        // } 
        // int m=ans.size();
        // for (int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i));
        //     System.out.print(" ");
        // }
        // System.out.println();
        ArrayList<Integer> ans=getPathDFS(adjacency_matrix, visited, startVertex, endVertex);
        if (ans==null){
            return;
        }
        for (int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
            System.out.print(" ");
        }
    }
}
