import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        int n = progresses.length;
        int[] dataLeft = new int[n];
        
        for(int i=0; i<n; i++){
            dataLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int count = 0;
        int maxLeft = dataLeft[0];
        
        for(int i=0; i<n; i++){
            
            if(dataLeft[i] <= maxLeft){
                count++;    
            }else{
                que.add(count);
                count = 1;
                maxLeft = dataLeft[i];
            }
        }
        que.add(count);
        return que.stream().mapToInt(Integer::intValue).toArray();
    }
}