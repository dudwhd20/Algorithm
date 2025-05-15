import java.util.*;

class Solution {
    
    private static int timeToMinute(String time){
        String[] tarr = time.split(":");
        return Integer.parseInt(tarr[0]) * 60 +  Integer.parseInt(tarr[1]);
    }
    
    public int solution(String[][] book_time) {
        
        int[][] times = new int[book_time.length][2];
        for(int i=0; i<book_time.length; i++){
            times[i][0] = timeToMinute(book_time[i][0]);
            times[i][1] = timeToMinute(book_time[i][1]) + 10;
        }
        
        Arrays.sort(times, Comparator.comparing(e -> e[0]) );
        
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        int ans = 0;
        
        for (int[] time : times ){
            int checkIn = time[0];
            int checkOutWithClean = time[1];
            
            while(!rooms.isEmpty() && rooms.peek() <= checkIn){
                rooms.poll();
            }
            
            rooms.offer(checkOutWithClean);
            ans = Math.max(ans, rooms.size());
        }
        
        
        return ans;
    }
}