package array.subsets;

import java.util.List;

public class NumberOfSubsetsWithProductLessThanK {

    private static int process(List<Integer> array, int k){
        int count = 0;
        List<List<Integer> > res = AllSubsetOfArray2.subsets(array);
        for(List<Integer> list : res) {
            if(list.isEmpty()) {
                continue;
            }
            int product = list.get(0);
            for(int i = 1 ; i < list.size(); i++) {
                product = product * list.get(i);
            }
            if (product < k) {
                count++;
            }
        }

        return count;
    }

    // Driver code
    public static void main(String[] args) {
        List<Integer> array = List.of(2, 4, 5, 3); int k = 12;
        //List<Integer> array = List.of(12, 32, 21); int k = 1;
        int num = process(array, k);
        // Print the generated output
        System.out.print("Count is " + num);
    }
}
