/**
 * 
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
 * @since 06/02/2023
 * 
 */

 public class NumOfIslands {

    public static void main(String[] args) {
        int[][] matrix = {{0,1},{1,0},{1,1},{1,0}};
        System.out.println(numIslands(matrix, 2, 4));
    }

    public static int numIslands(int[][] matrix, int n, int m) {
        int sum = 0;
        int[][] visited = new int[n][n];
        for ( int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                sum = sum + countIslands(matrix, visited, n, m, i, j);
            }
        }
        return 0;
    }

    private static int countIslands(int[][] matrix, int[][] visited, int n, int m, int i, int j) {
        int sum = 0;
        if(i>=n || j >= m) {
            return 0;
        }
        while(matrix[i][j] == 1 && visited[i][j]==0) {
            sum=1;
            visited[i][j] = 1;
            countIslands(matrix, visited, n, m, i, j+1);
            countIslands(matrix, visited, n, m, i+1, j);
        }

        return sum;
    }
 }