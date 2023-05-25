package practice;

/**
 * @since 25/05/2023
 */

public class Traversematrix {

    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        System.out.println("Row-wise matrix : ");                
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("(" + i + ", " + j +") is " + mat[i][j]);
            }
        }

        System.out.println("Column-wise matrix : ");                
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("(" + i + ", " + j +") is " + mat[j][i]);
            }
        }

    }

}