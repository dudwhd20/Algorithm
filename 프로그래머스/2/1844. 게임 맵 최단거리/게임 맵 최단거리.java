import java.util.*;


class Solution {
    static class Node{
        int x;
        int y; 
        int dist;
        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }    
    
    public int solution(int[][] maps) {
        int answer = -1;
        int x = maps.length;
        int y = maps[0].length;
        
        boolean[][] visited = new boolean[x][y];
        visited[0][0] = true;
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0,0,1));
        
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        
        while(!que.isEmpty()){
            var curr = que.poll();
            
            if(curr.x == x - 1 && curr.y == y - 1 ){
                answer = curr.dist;
                break;
            }
            
            for(int i = 0; i < dx.length; i++){
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];
                
                if(nx >= 0 && nx < x &&  ny >= 0 && ny < y && !visited[nx][ny] && maps[nx][ny] == 1 ){
                    visited[nx][ny] = true;
                    que.offer(new Node(nx, ny, curr.dist + 1));
                }
                
            }
            
        }
        
        
        return answer;
    }
}