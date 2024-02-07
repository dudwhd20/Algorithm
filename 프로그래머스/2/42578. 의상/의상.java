import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> m = new HashMap<>();
        for(String[] clothe : clothes){
            String type = clothe[1];
            m.put(type, m.getOrDefault(type,0) + 1);
        }
        int answer = 1;
        
        for(Integer i : m.values()){
            answer *=  i + 1;     
        }
        
        return answer - 1;
    }
}