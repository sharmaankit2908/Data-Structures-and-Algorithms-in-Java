import java.util.Scanner;

public class Solution {
    public static boolean dfs(int[][] adjacency_matrix, boolean[] visited, int v1, int v2, int n) {
        if (v1 == v2) {
            return true;
        }
        visited[v1] = true;
        for (int i = 0; i < n; i++) {
            if (adjacency_matrix[v1][i] == 1 && !visited[i]) {
                if (dfs(adjacency_matrix, visited, i, v2, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] adjacency_matrix = new int[v][v];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjacency_matrix[v1][v2] = 1;
            adjacency_matrix[v2][v1] = 1;
        }
        boolean[] visited = new boolean[v];
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println(dfs(adjacency_matrix, visited, v1, v2, v) ? "true" : "false");
    }
}
