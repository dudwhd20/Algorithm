def DFS(index, visited, c):
    for i, v in enumerate(c[index]):
        if v == 1 and visited[i] != True:
            visited[i] = True
            DFS(i,visited,c)
    return


def solution(n, computers):
    visited = [False] * n
    answer = 0

    for _ in computers:
        for i, v in enumerate(_):
            if v == 1 and visited[i] != True:
                visited[i] = True
                DFS(i, visited, computers)
                answer += 1
    return answer