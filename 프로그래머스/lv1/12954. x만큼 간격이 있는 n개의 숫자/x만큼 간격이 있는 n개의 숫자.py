def solution(x, n):
    answer = []

    if(x > 0):
        for _ in range(x, x*n+1, x):
            answer.append(_)
    elif(x < 0):
        for _ in range(x, x*n-1, x):
            answer.append(_)
    else:
        for _ in range(n):
            answer.append(0)        
    return answer