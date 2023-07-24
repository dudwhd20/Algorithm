import sys
from collections import deque

input = sys.stdin.readline

answerL = int(input())



dx = [0, 0, 1, - 1]
dy = [1, -1, 0, 0]


def BFS(g, xx, yy):
    queue = deque()
    g[xx][yy] = 0
    queue.append((xx, yy))
    while queue:
        xxx, yyy = queue.popleft()
        for _ in range(4):
            xxxx = xxx + dx[_]
            yyyy = yyy + dy[_]
            if xxxx < 0 or xxxx >= x or yyyy < 0 or yyyy >= y:
                continue
            if graph[xxxx][yyyy] == 1:
                queue.append([xxxx, yyyy])
                graph[xxxx][yyyy] = 0
    return


for _ in range(answerL):
    x, y, n = map(int, input().split())
    graph = [[0] * y for _ in range(x)]

    for _ in range(n):
        ix, iy = map(int, input().split())
        graph[ix][iy] = 1
        # print(graph)

    count = 0
    for i in range(x):
        for j in range(y):
            if graph[i][j] == 1:
                BFS(graph, i, j)
                count += 1

    print(count)
