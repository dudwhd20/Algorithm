from collections import deque
def solution(progresses, speeds):
    answer = []

    arr = [-((p - 100) // s) for p, s in zip(progresses, speeds)]

    arr= deque(arr)

    while arr :
        a = []
        p = arr.popleft()
        a.append(p)
        if arr :
            while arr and p >= arr[0]:
                p2 = arr.popleft()
                a.append(p2)
        answer.append(len(a))
    return answer