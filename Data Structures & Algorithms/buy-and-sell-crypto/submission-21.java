class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, end = prices.length;
        int maxP = 0;
        int currP = 0;
        while(l < end - 1) {
            r = l + 1;
            while(r < end) {
                if (currP > prices[r] - prices[l]) {
                    r++;
                } else {
                    currP = prices[r] - prices[l];
                    r++;
                }
                maxP = Math.max(maxP, currP);
            }


            l++;
        }

        return maxP;
    }
}
