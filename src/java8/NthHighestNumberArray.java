package java8;

import java.util.*;

public class NthHighestNumberArray {

    public static TreeSet<Integer> arrayToTreeset(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Arrays.stream(arr).forEach(i -> treeSet.add(i));
        return treeSet;
    }

    public static String getSecondHighest(int[] arr, int n) {
        List<Integer> list = new ArrayList<>(arrayToTreeset(arr));
        // Special Case
        if(list.size() == 1) {
            return String.valueOf(list.get(0));
        }

        if(list.size() < n) {
            return "Wrong Input";
        }

        return String.valueOf(list.get(list.size() - n));
    }

    public static void main(String[] args) {
        int n = 2;
        int[] intArray = new int[]{ 5, 4, 2, 2, 1 };
        System.out.println(getSecondHighest(intArray, 10));
    }
}
