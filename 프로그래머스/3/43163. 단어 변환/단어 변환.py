from collections import deque


def solution(begin, target, words):
    answer = 0

    if target not in words : 
        return answer        

    visited = []

    q = deque()
    q.append((begin , 0))

    while q:
        current, step = q.popleft()

        if current == target:
            answer = step
            break
        
        for _ in words:
            cnt = 0

            if current != _ and _ not in visited:
                
                for i in range(len(begin)):

                    if current[i] == _[i]:
                        cnt += 1
                        if cnt == len(begin) -1:
                            visited.append(_)
                            q.append((_, step + 1))
    return answer