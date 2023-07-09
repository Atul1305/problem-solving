package leetcode;

/**
 * 
 * Problem No. 122
 *
 * @see -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @since Feb 26th, 2023
 * 
 * Algo - Dynamic Programming, Sliding Window
 * 
 */

public class BestTimeToBuyStock2 {

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int cheapestPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {

            // TODO - Change Logic
            if(cheapestPrice > prices[i] ) {
                cheapestPrice = prices[i];
                continue;
            }
            int currentProfit = prices[i] - cheapestPrice;
            if( maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
    
}
