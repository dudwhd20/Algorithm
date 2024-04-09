import math

def is_prime(n):
    if n < 2:
        return False
    
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    visited = [False] * 7
    sarr = set()

    def dfs(nums, str, i):
        if i > len(nums):
            return None

        for i in range(len(nums)):
            if not visited[i]:
                visited[i] = True
                sarr.add(int(str + nums[i]))
                dfs(nums, str + nums[i], i +1)
                visited[i] = False

    dfs(numbers, "", 0)
    
    for _ in sarr:
        if is_prime(_): answer += 1

    return answer