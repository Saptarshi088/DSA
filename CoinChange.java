import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int coins[] = { 2, 3, 5 };
        int ammount = 11;
        System.out.println(coinChange(coins, ammount));
    }

    // Time Complexity: O(n*amount)
    // Space Complexity: O(amount)
    public static int coinChange(int[] coins, int ammount) {
        int dp[] = new int[ammount + 1];
        Arrays.fill(dp, ammount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= ammount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[ammount] > ammount ? -1 : dp[ammount];
    }
}
