def coinChange(self, coins, amount):
    amount_coins = [coins]
    for i in amount_coins:
        amount -= amount_coins[i]
        while amount > amount_coins[i]:
            amount -= amount_coins[i]
        if amount < 0:
            amount += amount_coins[i]
        print(amount)
        
coinChange([1,2,5], 11)