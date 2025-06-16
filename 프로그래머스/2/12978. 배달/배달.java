import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }        
        
        for(int[] r : road){
            int from = r[0] , to = r[1], cost = r[2];
            graph.get(from).add(new Node(to, cost));
            graph.get(to).add(new Node(from,cost));
        }
        
        
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0; 
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1,0));
        
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            if(curr.cost > dist[curr.to])continue;
            for(Node next : graph.get(curr.to)){
                int newCost = dist[curr.to] + next.cost;
                if (newCost < dist[next.to]) {
                    dist[next.to] = newCost;
                    pq.offer(new Node(next.to, newCost));
                }
            }
            
        }
        
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }
        
        
        return answer;
    }
    
    static class Node implements Comparable<Node>{
        int to;
        int cost;
        
        public Node(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Node o){
            return this.cost - o.cost;
        }
    }
}