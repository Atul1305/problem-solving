package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://www.geeksforgeeks.org/count-pairs-with-given-sum/
 */
public class CountPairsWithGivenSum {

    private static int getPairsCount(int[] arr, int sum) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            if(map.containsKey(sum-arr[i])) {
                count++;
            }
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return count;
    }

    private static int getUniquePairsCount(int[] arr, int sum) {
        int count = 0;
        Arrays.sort(arr);

        for(int i = 0, j = arr.length-1; i<j; i++, j--) {
            if(arr[i] + arr[j] == sum) {
                count++;
            }
        }

        return count;
    }

    // Driver function to test the above function
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 5};
        int n = arr.length;
        int sum = 6;
        System.out.println("Count of unique pairs is " + getUniquePairsCount(arr, sum));
        System.out.println("Count of pairs is " + getPairsCount(arr, sum));
    }
}
