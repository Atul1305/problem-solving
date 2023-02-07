/**
 * 
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
 * @since 06/02/2023
 * 
 */

 public class NumOfIslands {

    public static void main(String[] args) {
        //int[][] matrix = {{0,1},{1,0},{1,1},{1,0}};

        int[][] matrix = { {1, 1, 0, 0, 0},
                           {0, 1, 0, 0, 1},
                           {1, 0, 0, 1, 1},
                           {0, 0, 0, 0, 0},
                           {1, 0, 1, 0, 0}};
                         
        System.out.println(numIslands(matrix, 5, 5));
    }

    public static int numIslands(int[][] matrix, int n, int m) {
        int sum = 0;
        int[][] visited = new int[n][n];
        for ( int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                sum = sum + countIslands(matrix, visited, n, m, i, j);
            }
        }
        return sum;
    }

    private static int countIslands(int[][] matrix, int[][] visited, int n, int m, int i, int j) {
        int sum = 0;
        if(i==n || j == m || i < 0 || j < 0) {
            return sum;
        }
        if (matrix[i][j]==1 && visited[i][j]==0) {
            sum = 1;
            visited[i][j] = 1;
            countIslands(matrix, visited, n, m, i-1, j-1);
            countIslands(matrix, visited, n, m, i, j-1);
            countIslands(matrix, visited, n, m, i+1, j-1);
        

            countIslands(matrix, visited, n, m, i-1, j);
            countIslands(matrix, visited, n, m, i+1, j);

            countIslands(matrix, visited, n, m, i-1, j+1);
            countIslands(matrix, visited, n, m, i, j+1);
            countIslands(matrix, visited, n, m, i+1, j+1);

        }

        return sum;
    }
 }