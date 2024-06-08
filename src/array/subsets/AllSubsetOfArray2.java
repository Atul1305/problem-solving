package array.subsets;

import java.util.ArrayList;
import java.util.List;

/*
* Link -> https://www.geeksforgeeks.org/backtracking-to-find-all-subsets/
*
* Solution : Correct
* Comments : Using bit manipulation
 */

public class AllSubsetOfArray2 {

    public static List<List<Integer>> subsets(List<Integer> nums)
    {
        List<List<Integer>> res = new ArrayList<>();
        // Get the length of the input array
        int n = nums.size();

        // Loop through all possible subsets
        // using bit manipulation
        for (int i = 0; i < (1 << n); i++) {
            // Loop through all elements of the input array
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {

                // Check if the jth bit is set in the current subset
                if ((i & (1 << j)) != 0) {

                    // If the jth bit is set, add the jth element to the subset
                    subset.add(nums.get(j));
                }
            }
            res.add(subset);
        }

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        List<Integer> array = List.of(2, 4, 5, 3);
        List<List<Integer>> res = subsets(array);

        // Print the generated subsets
        for (List<Integer> subset : res) {
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
