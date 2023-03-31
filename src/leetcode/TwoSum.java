package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 1. Two Sum
 * Link -> https://leetcode.com/problems/two-sum/description/
 * @since March 23rd, 2023
 * 
 * 
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3,2,4}, 6);

        for (int i=0; i < result.length; i++) {
            System.out.println(result);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        Map<Integer, Integer> indexer = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int find = target - nums[i];
            if(indexer.containsKey(find)) {
                result[0] = indexer.get(find);
                result[1] = i;
                break;
            }
            indexer.put(nums[i], i);
            
        }
        return result;
    }
    
}
