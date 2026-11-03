class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0, minPrice = prices[0];
        
        for(int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            int currP = prices[i] - minPrice;
            maxP = Math.max(currP, maxP);
        }
        return maxP;
    }
}
