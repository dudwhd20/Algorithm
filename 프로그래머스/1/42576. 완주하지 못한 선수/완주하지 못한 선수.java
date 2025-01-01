import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> m = new HashMap<>();
        
        for(String s : participant){
            m.put(s, m.getOrDefault(s, 0) + 1);
        }
        
        for(String s : completion){
            m.put(s, m.get(s) - 1);
        }        
        
        for(String k : m.keySet()){
            if(m.get(k) != 0){
                answer = k;
            }
        }
        return answer;
    }
}