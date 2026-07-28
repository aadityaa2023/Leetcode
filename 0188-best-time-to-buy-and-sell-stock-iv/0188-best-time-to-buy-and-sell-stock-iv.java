class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        int[][] dp = new int[k + 1][n];
        for (int t = 1; t <= k; t++) {
            int best = -prices[0];
            for (int i = 1; i < n; i++) {
                best = Math.max(best, dp[t - 1][i - 1] - prices[i]);
                dp[t][i] = Math.max(dp[t][i - 1], prices[i] + best);
            }
        }
        return dp[k][n - 1];
    }
}