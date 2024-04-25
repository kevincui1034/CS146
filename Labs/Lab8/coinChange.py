from typing import List

class Coin:
    def coinChange(self, coins: List[int], amount: int) -> int:
        numCoins = len(coins)
        amountCoins = [amount + 1] * (amount + 1)
        amountCoins[0] = 0
        
        for i in range(1, amount + 1):
            for coin in coins:
                if coin <= i:
                    amountCoins[i] = min(amountCoins[i], amountCoins[i - coin] + 1)
        
        if amountCoins[amount] <= amount:
            return amountCoins[amount]
        else:
            return -1
    
coin = Coin()
coins = [1, 2, 5]
amount = 11
print(coin.coinChange(coins, amount))