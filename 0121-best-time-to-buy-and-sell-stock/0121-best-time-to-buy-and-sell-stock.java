//Apna Collage
//choose the day to buy min price stock
//and from the next day compare and sell at day when the profit is minimum
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int dayProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            dayProfit = prices[i] - buyPrice;
            if(profit < dayProfit){
                profit = dayProfit;
            }
        }
        return profit;
    }
}