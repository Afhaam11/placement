import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); 
        dp[0] = 0; 

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {    //if amount is greater then coinValue we dont need that coinValue
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("Minimum coins required: " + minCoins(coins, amount));
        sc.close();
    }
}