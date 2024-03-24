def solution(n, money):
    dp = [1] + [0] * n
    DIV = 1_000_000_007

    for coin in sorted(money):
        for price in range(coin, n+1):
            dp[price] = (dp[price] + dp[price - coin]) % DIV
            

            
    return dp[n]