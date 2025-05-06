import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) pq.add(s);
        
        while(pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            int mixed  = first + (second * 2);
            pq.add(mixed);
            count++;
        }
        
        return pq.peek() >= K ? count : -1;
        
    }
}