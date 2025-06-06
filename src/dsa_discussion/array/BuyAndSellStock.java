package dsa_discussion.array;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).



Example 1:

Input: prices = [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 */
public class BuyAndSellStock {
    static int maxProfitByStock(int [] arr){
        int [] leftProfit=new int[arr.length];
        int [] rightProfit=new int[arr.length];
        int minPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            minPrice=Math.min(minPrice,arr[i]);
            leftProfit[i]=Math.max(leftProfit[i-1],arr[i]-minPrice);
        }
        int maxPrice=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            maxPrice=Math.max(maxPrice,arr[i]);
            rightProfit[i]=Math.max(rightProfit[i+1],maxPrice-arr[i]);
        }
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            maxProfit=Math.max(maxProfit,leftProfit[i]+rightProfit[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr={3,3,5,0,0,3,1,4};
        System.out.println(maxProfitByStock(arr));

    }
}
