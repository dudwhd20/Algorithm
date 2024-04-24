from collections import deque

def solution(prices):
    answer = []
    prices = deque(prices)
    while prices:
        c = 0
        s = prices.popleft()
        for _ in prices:
            if _ >= s:
                c += 1
            else: 
                c += 1
                break
        answer.append(c)
    return answer