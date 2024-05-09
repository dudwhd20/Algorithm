def solution(rsp):
    answer = ''
    for _ in rsp:
        if _ == '2':
            answer += '0'
        elif _ == '0':
            answer += '5'
        else:
            answer += '2'
    
    return answer