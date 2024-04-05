from collections import deque

def solution(n, edge):
    grap = {}
    for i in range(len(edge)):
        if edge[i][0] not in grap :
            grap[edge[i][0]] = [edge[i][1]]
        else :
            grap[edge[i][0]].append(edge[i][1])

        if edge[i][1] not in grap :
            grap[edge[i][1]] = [edge[i][0]]
        else :
            grap[edge[i][1]].append(edge[i][0])

    visited = [False] * (n + 1)
    q = deque()
    q.append((1,1))
    visited[1] = True
    distance = [0] * (n+1)
    distance[1] = 1

    while q :
        node,step = q.popleft()
        for _ in grap[node]:
            if not visited[_]:
                q.append((_,  step + 1))
                visited[_] = True
                distance[_] = distance[node] + 1

    return distance[1:].count(max(distance[1:]))