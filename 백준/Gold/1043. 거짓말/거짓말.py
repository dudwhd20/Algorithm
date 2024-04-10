n, m = map(int, input().split())
array = list(map(int, input().split()))
party = [list(map(int, input().split())) for _ in range(m)]
graph = [[] for _ in range(n+1)]
visited = [False for _ in range(n+1)]

def dfs(x):
    visited[x] = True

    for x_ in graph[x]:
        if not visited[x_]:
            dfs(x_)

# 그래프 초기화
for data in party:
    for i in range(data[0]):
        for j in range(i+1, data[0]):
            graph[data[i+1]].append(data[j+1])
            graph[data[j+1]].append(data[i+1])

# 진실을 알게 되는 사람의 명단 초기화
for i in range(array[0]):
    x = array[i+1]
    dfs(x)

# 파티에 참석한 사람 확인
result = 0
for i in range(m):
    count = 0
    for x in party[i][1:]:
        if not visited[x]:
            count += 1
    
    if party[i][0] == count:
        result += 1

print(result)