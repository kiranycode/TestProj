/*
 * Given an array of integers representing stock price on a single day,
 *  find max profit that can be earned by 1 transaction.
 * So you need to find a pair (buyDay,sellDay) where buyDay < = sellDay and 
 * it should maximize the profit. For example:
 */

package com.hundreadquestions;

public class Stocks {

	public static void main(String[] args) {
		int [] numbers={14, 12, 70, 15, 99, 65, 21, 90};
		System.out.println(calculateMaxProfit(numbers));
	}

	public static int calculateMaxProfit(int[] arr) {
        int lowestPriceTillThatDay = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowestPriceTillThatDay) {
                profit = arr[i] - lowestPriceTillThatDay;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPriceTillThatDay = arr[i];
            }
        }
        return maxProfit;
    }

}
