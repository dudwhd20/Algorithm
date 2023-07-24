import sys

input = sys.stdin.readline

cl = int(input())
nl = int(input())

visited = [False] * (cl + 1)
answer = [[] for _ in range(cl + 1)]

for _ in range(nl):
    s, e = map(int, input().split())
    answer[s].append(e)
    answer[e].append(s)



def DFS(i):
    global answer, visited
    visited[i] = True
    stack = answer[i]
    while stack:
        p = stack.pop()
        if not visited[p]:
            DFS(p)


DFS(1)
print(visited.count(True)-1)
