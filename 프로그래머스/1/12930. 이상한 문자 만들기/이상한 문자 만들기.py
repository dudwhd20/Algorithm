def solution(s):
    sarr = s.split(' ')
    answer = ''
    for idx , str in enumerate(sarr):
        for i ,v in enumerate(str):
            i += 1
            if i % 2 == 0:
                answer += v.lower()
            else:
                answer += v.upper()
        if idx + 1 != len(sarr):
            answer += ' '
    return answer