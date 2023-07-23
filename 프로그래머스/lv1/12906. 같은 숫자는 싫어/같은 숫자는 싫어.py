def solution(arr):
    answer = [arr[0]]
    for i in arr[1:]:
        p = answer.pop()
        if p == i:
            answer.append(i)
        else:
            answer.append(p)
            answer.append(i)

    return answer