import sys
input = sys.stdin.readline

n,m = map(int, input().split())
arrive = False
A = [[] for _ in range(n)]
visited = [False] * n

def DFS(now, dep):
    global arrive
    if dep == 5:
        arrive = True
        return

    visited[now] = True
    for i in A[now]:
        if not visited[i]:
            DFS(i, dep+1)
    visited[now] = False



for _ in range(m):
    s,e=map(int,input().split())
    A[s].append(e)
    A[e].append(s)

for i in range(n):
    DFS(i,1)
    if arrive:
        break

if arrive:
    print(1)
else:
    print(0)
