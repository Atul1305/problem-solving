package array;

/*
https://leetcode.com/problems/shuffle-the-array/description/
 */

public class ShuffleTheArray {

    private static Integer[] shuffle(Integer arr[]) {
        int halfLength = arr.length/2;
        Integer[] res = new Integer[arr.length];
        int index = 0;
        if(res.length % 2 == 1){
            return new Integer[0];
        }
        for(int i=0; i<halfLength; i++) {
            res[index] = arr[i];
            index++;
            res[index] = arr[i+halfLength];
            index++;
        }
        return res;
    }

    // Driver function to test the above function
    public static void main(String[] args) {
        Integer arr[] = {2,5,1,3,4,7};
        // Integer arr[] = {1,2,3,4,4,3,2,1};
        // Integer arr[] = {1,2,3,4,4,3,2};
        // Integer arr[] = {1,1,2,2};

        new CArrays<Integer>().printArray(shuffle(arr));
    }
}
