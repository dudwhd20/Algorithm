import java.util.*;

class Solution {
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] visited = new boolean[m][n];
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && picture[i][j] != 0){
                    numberOfArea++;
                    int size = bfs(i, j, picture, visited, m, n, dx, dy);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private static int bfs(int x, int y, int[][] picture, boolean[][] visited, int m, int n, int[] dx, int[] dy){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        int color = picture[x][y];
        int size  = 1;
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int curx = curr[0];
            int cury = curr[1];
            
            for(int i=0; i< 4; i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < m && ny <n){
                    if(!visited[nx][ny] && picture[nx][ny] == color){
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx,ny});
                        size++;
                    }
                }
                
            }
            
        }
        return size;        
    }
    
}