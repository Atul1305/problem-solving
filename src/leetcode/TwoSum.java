package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Link -> https://leetcode.com/problems/two-sum/description/
 * @since March 23rd, 2023
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

        for (int indexOfCurrentNum=0; i<nums.length; i++) {
            int find = target - nums[indexOfCurrentNum];
            if(indexer.containsKey(find)) {
                result[0] = indexer.get(find);
                result[1] = indexOfCurrentNum;
                break;
            }
            indexer.put(nums[indexOfCurrentNum], indexOfCurrentNum);
            
        }
        return result;
    }
    
}
