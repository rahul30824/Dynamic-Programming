import java.util.*;
class Main{
public static int Solution(int []coins,int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1); // Use large value
    dp[0] = 0;

    for(int i = 1; i <= amount; i++) {
        for(int coin : coins) {
            if(i >= coin) {
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];
}
public static void main(String[] args)
{
    int amount=100;
    int [] coins={1,2,3,4,5};
    System.out.print(Solution(coins,amount));
}
}
