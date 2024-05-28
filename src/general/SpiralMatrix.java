package general;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Problem Link : https://www.educative.io/answers/spiral-matrix-algorithm
 * @since 14/04/2023
 *
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        /*int[][] matrix = {  {1, 2, 3, 4, 5},
                            {16, 17, 18, 19, 6},
                            {15, 24, 25, 20, 7},
                            {14, 23, 22, 21, 8},
                            {13, 12, 11, 10, 9}
        };*/
        int[][] matrix = {  {1, 2, 3, 4, 5},
                            {16, 17, 18, 19, 6}
        };

        //printMatrix(matrix, 5, 5);
        List<Integer> result = new ArrayList<>();
        int x1 = 0;
        int x2 = 5;
        int y1 = 0;
        int y2 = 2;
        while(x1 < x2 || y1 < y2) {
            spiralMatrix(matrix, result, x1, y1, x2, y2);
            x1++;
            x2--;
            y1++;
            y2--;
        }
        printList( result);

    }

    private static void spiralMatrix(int[][] matrix, List<Integer> result, int x1, int y1, int x2, int y2) {
        for(int j = x1; j < x2; j++) {
            result.add(matrix[x1][j]);
        }
        for(int i = x1+1; i < x2; i++) {
            int j = y2-1;
            result.add(matrix[i][j]);
        }
        for(int j = y2-2; j >= y1; j--) {
            int i = x2-1;
            result.add(matrix[i][j]);
        }
        for(int i = x2-2; i > x1; i--) {
            int j = y1;
            result.add(matrix[i][j]);
        }

    }

    private static void printMatrix(int[][] matrix, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printList(List<Integer> arr) {
        System.out.println("Result : ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
        
}
