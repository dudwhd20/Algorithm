import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> minque = new PriorityQueue<>();
        PriorityQueue<Integer> maxque = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String oper : operations){
            String[] o = oper.split(" ");
            
            if(o[0].equals("I")){
                minque.offer(Integer.valueOf(o[1]));
                maxque.offer(Integer.valueOf(o[1]));
            }else if(o[0].equals("D") && o[1].equals("1")){
                minque.remove(maxque.poll());
            }else if(o[0].equals("D") && o[1].equals("-1")){
                maxque.remove(minque.poll());
            }

            
        }
        
        if(maxque.isEmpty() && minque.isEmpty()) return new int[]{0,0};
        
        return new int[]{maxque.poll(), minque.poll()};
    }
}