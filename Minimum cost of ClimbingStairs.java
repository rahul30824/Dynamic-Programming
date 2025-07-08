
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];  // dp[i] = min cost to reach step i

        dp[0] = 0;  // Start from ground (before step 0)
        dp[1] = 0;  // Can also start from step 1

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],  // jump from step i-1
                dp[i - 2] + cost[i - 2]   // jump from step i-2
            );
        }

        return dp[n];  // min cost to reach the top (just after last step)
    }
}
