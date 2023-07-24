r = 0

def DFS(i, c, n, t):
    global r

    if c >= len(n):
        if i == t:
            r += 1
        return
    c += 1
    DFS(i + n[c - 1], c, n, t)
    DFS(i - n[c - 1], c, n, t)


def solution(numbers, target):
    DFS(0, 0, numbers, target)
    return r