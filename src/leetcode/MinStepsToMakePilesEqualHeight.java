package leetcode;

import java8.NthHighestNumberArray;

/**
 *
 * @see -> https://leetcode.com/discuss/interview-question/364618/#:~:text=Determine%20the%20minimum%20number%20of,of%20steps%20required%20is%203.
 *
 */
public class MinStepsToMakePilesEqualHeight {
    public static volatile boolean flag = true;
    public static int count = 0;

    public static int[] process(int[] arr, int secondHighestNumber) {
        boolean localFlag = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > secondHighestNumber) {
                arr[i] = arr[i] - secondHighestNumber;
                localFlag = true;
            }
        }
        if (!localFlag) {
            flag = localFlag;
        } else {
            count++;
        }

        return arr;
    }


    public static void main(String[] args) {
        int n = 2;
        int[] intArray = new int[]{ 5, 2, 1 };
        int secondHighestNumber = -1;

        while (flag) {
            try {
                secondHighestNumber = Integer.parseInt(NthHighestNumberArray.getSecondHighest(intArray, n));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.exit(0);
            }
            intArray = process(intArray, secondHighestNumber);
        }

        System.out.println(count);

    }
}
