def solution(n):
    a = [0] * (n + 1)
    a[0] = 0
    a[1] = 1
    for _ in range(2, n + 1):
        a[_] = a[_ - 2] + a[_ - 1]
    return a[n] % 1234567