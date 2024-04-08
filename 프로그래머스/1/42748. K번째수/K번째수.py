def solution(array, commands):
    answer = []
    for _ in commands:
        a = array[_[0]-1 : _[1]]
        a.sort()
        answer.append(a[_[2]-1])
    return answer