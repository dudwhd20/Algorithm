from collections import deque
def solution(priorities, location):
    answer = 0
    m = max(priorities)
    
    t = [0 for _ in range(len(priorities))]
    
    t[location] = 1
    
    que = deque(priorities)
    
    while True:
        if not t or max(t) == 0:
            break
        if max(que) == que[0]:
            que.popleft()
            del t[0]
            answer += 1
        else:
            que.append(que.popleft())
            t.append(t[0])
            del t[0]
            
    
    return answer