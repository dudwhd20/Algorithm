class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers, visited);
                answer++;
            }    
        }
        
        
        return answer;
    }
    
    public void dfs(int current, int[][]computers, boolean[] visited){
        visited[current] = true;
        
        for(int next = 0; next < computers.length; next ++){
            if(current != next && computers[current][next] == 1 && !visited[next]){
                dfs(next, computers, visited);
            }
        }
    }
    
    
}