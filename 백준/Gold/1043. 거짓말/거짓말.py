import sys
n,m = map(int, sys.stdin.readline().split())
array = list(map(int, sys.stdin.readline().split()))
party = [list(map(int, sys.stdin.readline().split())) for _ in range(m)]
visited = [False] * (n + 1)
grahp = [[] for _ in range(n + 1)]

def dfs(x):
    visited[x] = True
    
    for _ in grahp[x]:
        if not visited[_]:
            dfs(_)

for d in party:
    for i in range(d[0]):
        for j in range(i+1, d[0]):
            grahp[d[i+1]].append(d[j+1])
            grahp[d[j+1]].append(d[i+1])



for i in range(array[0]):
    x = array[i+1]
    dfs(x)

result = 0
for i in range(m):
    count = 0
    for x in party[i][1:]:
        if not visited[x]:
            count += 1
    
    if party[i][0] == count:
        result += 1

print(result)