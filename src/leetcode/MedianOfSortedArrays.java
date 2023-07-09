package leetcode;

/**
* @see -> 4. Median of Two Sorted Arrays.
* @since Apr 4th, 2023
*
* Algo -
*
 */
public class MedianOfSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smallArr;
        int[] largeArr;
        int combinedLen = nums1.length + nums2.length;
        int[] combinedArr = new int[combinedLen];

        int smallP=0;
        int largeP=0;

        if(nums1.length <= nums2.length) {
            smallArr = nums1;
            largeArr = nums2;
        } else {
            smallArr = nums2;
            largeArr = nums1;
        }

        for(int i=0; i<combinedLen; i++) {
            if(smallP == smallArr.length) {
                addRestOfTheValues(largeArr, combinedArr, largeP, i);
                break;
            }

            if(largeP == largeArr.length) {
                addRestOfTheValues(smallArr, combinedArr, smallP, i);
                break;
            }

            if(smallArr[smallP] <= largeArr[largeP]) {
                combinedArr[i] = smallArr[smallP];
                smallP++;
            } else {
                combinedArr[i] = largeArr[largeP];
                largeP++;
            }
        }

        System.out.println(combinedArr);

        if(combinedLen % 2 == 0) {
            int i1 = combinedLen/2;
            int i2 = i1-1;
            double sum  = combinedArr[i1] + combinedArr[i2];
            return sum/2;
        } else {
            int i1 = combinedLen/2;
            return combinedArr[i1];
        }
    }

    private static void addRestOfTheValues(int[] source, int[] target, int startIndex, int targetIndex) {
        for(int i=startIndex; i<source.length; i++) {
            target[targetIndex] = source[i];
            targetIndex++;
        }
    }
}