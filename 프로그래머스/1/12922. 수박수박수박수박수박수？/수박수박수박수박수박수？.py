def solution(n):
    answer = ''
    for _ in range(1,n+1):
        if _%2 == 0:
            answer += '박'
        else :
            answer += '수'
    
    return answer