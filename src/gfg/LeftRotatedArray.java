/*
 *
 * Link -> https://www.geeksforgeeks.org/array-rotation/
 * @since Apr 23rd, 2024
 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to
 * the left by d positions.
 *
 * Input:
 * arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
 * Output: 3 4 5 6 7 1 2
 *
 * */

package gfg;

public class LeftRotatedArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        int d = 2;
        rotateArray(arr, d);
    }

    public static void rotateArray(int[] arr, int d) {
        int[] result = new int[arr.length];
        int index=0;
        for(int i = d; i<arr.length; i++){
            result[index] = arr[i];
            index++;
        }

        for (int i = 0; i<d; i++) {
            result[index] = arr[i];
            index++;
        }

        print(result);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
