package leetcode;

/**
 * 11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0)
 * and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * @datastructure : Array
 * @see: https://leetcode.com/problems/container-with-most-water/
 * @since July 7th, 2023
 *
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int result1 = ContainerWithMostWater.twoSumBruteForce(new int[]{1,8,6,2,5,4,8,3,7});
        int result2 = ContainerWithMostWater.twoSumBruteForce(new int[]{1,5,4,3});
        int result3 = ContainerWithMostWater.twoSumBruteForce(new int[]{3,1,2,4,5});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int twoSumBruteForce(int[] nums) {
        int mostWater = 0;

        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                int height = nums[i] >= nums[j] ? nums[j] : nums[i];
                height = height > 0 ? height : height *- 1; // Math : Mode operation
                int breadth = j-i;

                int currentBucketWater = height * breadth;

                if (currentBucketWater > mostWater) {
                    mostWater = currentBucketWater;
                }
            }
        }

        return mostWater;
    }

}
