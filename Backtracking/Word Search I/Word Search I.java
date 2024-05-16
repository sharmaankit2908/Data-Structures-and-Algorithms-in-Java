public class Solution {

    public static boolean present_helper(char [][]board, String word, int n, int m,int i, int j,int[][] visited, int start_index){
        if (start_index==word.length()){
            return true;
        }
        // if (i<0 || i>=n || j<0 || j>=m){
        //     return false;
        // }
        visited[i][j]=1;
        if (i+1<n && visited[i+1][j]==0 && board[i+1][j]==word.charAt(start_index)){
            if (present_helper(board, word, n, m, i+1, j, visited, start_index+1)){
                return true;
            }
        }
        if (i-1>=0 && visited[i-1][j]==0 && board[i-1][j]==word.charAt(start_index)){
            if (present_helper(board, word, n, m, i-1, j, visited, start_index+1)){
                return true;
            }
        }
        if (j+1<m && visited[i][j+1]==0 && board[i][j+1]==word.charAt(start_index)){
            if (present_helper(board, word, n, m, i, j+1, visited, start_index+1)){
                return true;
            }
        }
        if (j-1>=0 && visited[i][j-1]==0 && board[i][j-1]==word.charAt(start_index)){
            if (present_helper(board, word, n, m, i, j-1, visited, start_index+1)){
                return true;
            }
        }
        visited[i][j]=0;
        
        return false;       
    }
    public static boolean present(char [][]board, String word, int n, int m) {
        // Write your code here.
        if (word.isEmpty()){
            return true;
        }
        int [][] visited=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (board[i][j]==word.charAt(0)){
                    if (present_helper(board, word, n, m, i, j, visited,1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}