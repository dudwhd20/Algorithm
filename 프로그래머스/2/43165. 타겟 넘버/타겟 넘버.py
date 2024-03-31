def dfs(i, c , n, t):
    answer = 0

    if c >= len(n):
        if i == t:
            return 1
        else:
            return 0

    c += 1
    answer += dfs(i + n[c - 1], c, n, t)
    answer += dfs(i - n[c - 1], c, n, t)
    return answer


def solution(numbers, target):
    return dfs(0,0, numbers, target)