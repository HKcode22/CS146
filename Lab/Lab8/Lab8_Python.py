from typing import List
class lab:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # dp = dp[amount+1]*(amount + 1)
        
        dp = [amount + 1] * (amount + 1)


        # dp = []
        # for i in range(1,amount+1):
        #     # dp[i] = amount+1
        #     dp.append(amount)

        dp[0] = 0

        for i in range(1, amount+1):
            for c in coins:
                if i - c >= 0:
                    dp[i] = dp[i-c]+1
                    # dp[i] = min(dp[i], dp[i - c] + 1)


        return -1 if dp[amount] > amount else dp[amount]

def main():
    l = lab()
    a = [1,2,5]
    amt = 11
    print(l.coinChange(a,amt))

if __name__ == "__main__":

    main()


