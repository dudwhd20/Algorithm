import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0, totalWeight = 0, idx = 0;
        for(int i = 0; i < bridge_length; i++) bridge.add(0);
        
        
        while(idx < truck_weights.length){
            time++;
            totalWeight -= bridge.poll();
            
            if(totalWeight + truck_weights[idx] <= weight){
                bridge.add(truck_weights[idx]);
                totalWeight += truck_weights[idx];
                idx++;                
            }else{
                bridge.add(0);
            }
            
        }
        return time + bridge_length;
        
        
    }
}