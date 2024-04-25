import java.util.Arrays;

public class Coin {
    public int coinChange(int[] coins, int amount) {
        int[] amountCoins = new int[amount + 1];
        Arrays.fill(amountCoins, amount + 1);
        amountCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    amountCoins[i] = Math.min(amountCoins[i], amountCoins[i - coin] + 1);
                }
            }
        }
        if (amountCoins[amount] <= amount) {
            return amountCoins[amount];
        }
        else {
            return amountCoins[amount] = -1;
        }
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coin.coinChange(coins, amount));
    }
}
