def solution(n):
    #b = format(value, 'b')
    b1 = format(n, 'b')
    l = b1.count('1')
    answer = n+1    
    while True:
        if(l == format(answer, 'b').count('1')):
            break
        answer += 1        
        
    return answer