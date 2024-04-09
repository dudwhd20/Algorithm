def solution(k, dungeons):
    visited = [False] * len(dungeons)
    rarr = []
    def dfs(k, d, c):
        if d >= len(dungeons):
            rarr.append(c)
            return
        
        for i in range(len(dungeons)):
            if not visited[i]:
                visited[i] = True
                need = dungeons[i][0]
                use = dungeons[i][1]
                if k >= need:
                    dfs(k - use, d + 1, c + 1)
                else :
                    dfs(k, d + 1, c)
                visited[i] = False
    dfs(k,0,0)
    return max(rarr)