class Solution {
    int[] ginfo;
    int[][] gedges;
    int maxSheepCnt;
    
    
    public int solution(int[] info, int[][] edges) {
        ginfo = info;
        gedges = edges;
        boolean[] initVisited = new boolean[info.length];
        dfs(0,initVisited,0,0);
        return maxSheepCnt;
    }
    
    public void dfs(int idx, boolean[] currVisited, int sheepCnt, int wolfCnt){
        currVisited[idx] = true;
        if(ginfo[idx]==0){
            sheepCnt++;
            if(sheepCnt > maxSheepCnt){
                maxSheepCnt = sheepCnt;
            }
        }else{
            wolfCnt++;
        }
        
        if(wolfCnt >= sheepCnt) return;
        
        for(int[] edge : gedges){
            
            if(currVisited[edge[0]] && !currVisited[edge[1]]){
                
                boolean[] nextVisited = new boolean[currVisited.length];
                for(int i=0; i<nextVisited.length; i++){
                    nextVisited[i] = currVisited[i];
                }
                dfs(edge[1], nextVisited, sheepCnt,wolfCnt);
            }
            
        }
        
    }
    
}