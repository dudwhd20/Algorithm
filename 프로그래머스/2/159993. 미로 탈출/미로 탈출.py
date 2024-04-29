from collections import deque


def bfs(start, end, maps):
    answer = -1
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]
    rows = len(maps)
    cols = len(maps[0])
    visited = [ [False for _ in range(cols)] for _ in range(rows) ]
    q = deque()

    q.append((start, 0))

    while q :
        starts , c = q.popleft()
        i, j = starts
        if maps[i][j] == end:
            answer = c

        for _ in range(4):
            nx = i + dx[_] 
            ny = j + dy[_]
            if 0 <= nx < rows and 0 <= ny < cols:
                if not visited[nx][ny]:
                    if maps[nx][ny] != 'X':
                        q.append(((nx,ny), c + 1))
                        visited[nx][ny] = True

    return answer
              

def solution(maps):
    answer = -1

    for i in range(len(maps)):
        for j in range(len(maps[i])) :
            if maps[i][j] == 'S':
                start = (i,j)
            if maps[i][j] == 'L':
                lever = (i,j)
    
    cl = bfs(start, "L",maps)
    ce = bfs(lever, "E",maps)

    if cl != -1 and ce != -1:
        answer = cl + ce    
    

    return answer