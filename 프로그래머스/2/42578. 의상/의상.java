import java.util.*;

class Solution {
    public int solution(String[][] cs) {
        int answer = 1;
        Map<String,Integer> m = new HashMap<>();
        
        for(String[] sarr : cs){
            m.put(sarr[1], m.getOrDefault(sarr[1] ,0) + 1);            
        }
        
        Iterator<Integer> iter = m.values().iterator();
        
        while(iter.hasNext()){
            answer *= iter.next().intValue() + 1;
        }
        
        return answer - 1;
    }
}