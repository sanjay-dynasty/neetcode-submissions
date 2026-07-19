class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
            
        int max = 0;
        int minSoFar = Integer.MAX_VALUE;

        // Start from index 0 to catch the absolute lowest price
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] < minSoFar) {
                minSoFar = prices[j]; // FIX: Update using current price at j
            }
            max = Math.max(max, prices[j] - minSoFar);
        }

        return max;
    }
}
