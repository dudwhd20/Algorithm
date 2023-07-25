def solution(n):
    arr = []
    for _ in range(1, n+1):
        if(n % _ == 0 ):
            arr.append(_)
    return sum(arr)