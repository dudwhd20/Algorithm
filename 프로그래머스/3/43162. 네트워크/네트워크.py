from collections import deque

def solution(n, computers):
    answer = 0
    visited = [[False] * n for _ in range(n)]
    q = deque()

    for i in range(n):
        for j in range(n):

            if computers[i][j] and not visited[i][j]:
                q.append((i,j))

                while q :
                    x, y = q.popleft()
                    visited[x][y] = True
                    for _ in range(n):
                        if computers[x][_] and not visited[x][_]:
                            visited[x][_] = True
                            q.append((_,x))
                answer += 1
    return answer