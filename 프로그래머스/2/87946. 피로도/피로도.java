class Solution {
    boolean[] visited;
    int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return max;
    }
    
    public void dfs(int depth, int k, int[][] dungeons){
        max = Math.max(max, depth);
        for(int i=0; i<dungeons.length;i++){
            int r = dungeons[i][0];
            int c = dungeons[i][1];
            if(!visited[i] && k >= r){
                visited[i] = true;
                dfs(depth + 1, k - c, dungeons);
                visited[i] = false;
            }
        }
        
    }
    
    
}
