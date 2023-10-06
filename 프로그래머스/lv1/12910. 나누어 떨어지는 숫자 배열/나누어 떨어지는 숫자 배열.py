def solution(arr, divisor):
    answer = []
    for _ in arr:
        if _ % divisor == 0:
            answer.append(_)
    if not answer:
        answer.append(-1)
    answer.sort()
    
    return answer