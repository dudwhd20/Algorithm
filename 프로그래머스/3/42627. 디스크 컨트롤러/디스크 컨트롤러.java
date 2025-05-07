import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparing(a -> a[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a->a[1]));
        int time = 0, count =0, idx = 0, total = 0;
        
        while(count < jobs.length){
            
            while(idx < jobs.length && jobs[idx][0] <= time){
                pq.add(jobs[idx++]);
            }
            
            if(!pq.isEmpty()){
                int[] job = pq.poll();
                time += job[1];
                total += (time - job[0]);
                count++;                
            }else{
                time = jobs[idx][0];
            }
            
        }
        
        
        
        return total / jobs.length;
    }
}