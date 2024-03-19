def solution(n):
    arr = [1, 1 + 1]
    for _ in range(2, n):
        arr.append(arr[_ - 1] + arr[_ - 2])
    return arr[n-1] % 1234567