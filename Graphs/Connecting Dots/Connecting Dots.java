import java.util.*;

public class Solution {
	public static ArrayList helper(String[] board, int i, int j, int n, int m, boolean[][] visited, ArrayList<Integer> l){
		visited[i][j]=true;
		int[] X_dim={1,-1,0,0};
		int[] Y_dim={0,0,1,-1};
		visited[i][j]=true;

		for (int k=0;k<4;k++){
			int a=i+X_dim[k];
			int b=j+Y_dim[k];
			if (a>=0 && b>=0 && a<n && b<m && !visited[a][b] && board[a].charAt(b)==board[i].charAt(j)){	
				l.add(a);
				l.add(b);
				l= helper(board, a, b,n, m, visited,l);
			}
		}
		visited[i][j]=false;
		return l;
	}

    int solve(String[] board , int n, int m)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
	
		boolean[][] visited=new boolean[n][m];
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				char c=board[i].charAt(j);
				if (!visited[i][j]){
					
					ArrayList<Integer> l=new ArrayList<>();
					ArrayList<Integer> a=helper(board, i, j, n, m, visited, l);
					if (a.size()>4){
						int x_last=a.get(a.size()-2);
						int y_last=a.get(a.size()-1);
						if ((x_last+1==i && y_last==j) || (x_last-1==i && y_last==j)|| (x_last==i && y_last+1==j) || (x_last==i && y_last-1==j)){
							return 1;
						}
					}
					visited[i][j]=true;
				}
			}
		}
		return 0;
	}	
}