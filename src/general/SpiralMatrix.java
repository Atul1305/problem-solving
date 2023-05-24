package general;

/**
 * Problem Link : https://www.educative.io/answers/spiral-matrix-algorithm
 * @since 14/04/2023
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] mat = { {1},
                        {4},
                        {7}};
        Set<Integer> spiralMatrixSet = new LinkedHashSet<>();
        int x1=0, x2=1, y1=0, y2=3;

        // TODO : Think about this condition.
        while(x1<x2) {
            addBoundaryElement(mat, x1, x2, y1, y2, spiralMatrixSet);
            x1++;
            x2--;
            y1++;
            y2--;
        }

        System.out.println("Spiral Matrix is - " + spiralMatrixSet);
    }

    private static void addBoundaryElement(int[][] mat, int x1, int x2, int y1, int y2, Set<Integer> spiralMatrixSet) {

        for (int i = x1; i < x2; i++) {
            spiralMatrixSet.add(mat[i][y1]);
        }
        for (int i = y1; i < y2; i++) {
            spiralMatrixSet.add(mat[x2-1][i]);
        }
        for (int i = x2-1; i > x1; i--) {
            spiralMatrixSet.add(mat[i][y2-1]);
        }
        for (int i = y2-1; i > y1; i--) {
            spiralMatrixSet.add(mat[x1][i]);
        }


    }
        
}
