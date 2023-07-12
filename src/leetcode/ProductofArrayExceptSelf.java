package leetcode;

/**
 * 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * @datastructure : Array
 * @see: https://leetcode.com/problems/product-of-array-except-self/
 * @since July 10th, 2023
 *
 */
public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        //int[] result = ProductofArrayExceptSelf.productofArrayExceptSelf(new int[]{3,2,4});
        int[] result1 = ProductofArrayExceptSelf.productofArrayExceptSelf(new int[]{-1,1,0,-3,3});


        for (int i=0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }
    }

    public static int[] productofArrayExceptSelf(int[] arr) {
        int totalProduct = 1;
        int[] result = new int[arr.length];

        for (int i=0; i < arr.length; i++) {
            totalProduct = arr[i] * totalProduct;
        }

        for (int i=0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[i] = totalProduct / arr[i];
            } else {
                result[i] = skipProduct(arr, i);
            }
        }

        return result;
    }

    public static int skipProduct(int[] arr, int skipIndex) {
        int product = 1;

        for (int i=0; i < arr.length; i++) {
            if(i != skipIndex) {
                product = arr[i] * product;
            } else {
                continue; // Unnecessary
            }
        }

        return product;
    }

}
