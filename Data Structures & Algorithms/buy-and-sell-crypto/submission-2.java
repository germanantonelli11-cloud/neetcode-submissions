class Solution {
    public int maxProfit(int[] prices) {
        int maxDifference = 0;
        for(int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int difference = 0;
                if (prices[j] > prices[i]){
                    difference = prices[j] - prices[i];
                }
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        } 
    return maxDifference;
    }
}
