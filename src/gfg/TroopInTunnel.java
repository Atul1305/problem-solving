package gfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Link : https://www.geeksforgeeks.org/minimum-cost-of-passing-n-persons-through-a-given-tunnel/
 * @since 05/31/2024
 *
 */
public class TroopInTunnel {
    // input: arr[] = {1, 3, 4, 4, 2}, X = 4, Y = 6, H = 9

    public static void main(String[] args){
        int[] arr = {1, 3, 4, 4, 2, 6};
        int x = 4;
        int y = 6;
        int h = 9;

        int result = troopInTunnel(arr, x, y, h);

        System.out.println(result);

    }

    private static int troopInTunnel(int[] arr, int x, int y, int h) {
        Arrays.sort(arr);
        int cost = 0;
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            if(arr[i] + arr[j] <= h) {
                cost = cost + y;
                i++;
                j--;
            } else {
                cost = cost + x;
                j--;
            }
        }
        if( i == j) {
            cost = cost + x;
        }
        return cost;
    }
}
