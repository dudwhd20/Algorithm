def solution(n):
    answer = []
    for _ in range(len(str(n)) , 0 , -1 ):
        answer.append(int(str(n)[_-1]))
    return answer