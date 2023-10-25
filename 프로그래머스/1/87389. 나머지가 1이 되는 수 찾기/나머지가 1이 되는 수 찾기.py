def solution(n):
    for _ in range(2, n):
        if n % _ == 1: 
            return  _
