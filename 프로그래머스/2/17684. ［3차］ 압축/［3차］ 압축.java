import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();
        
        for(int i = 'A'; i <= 'Z'; i++ ){
            dict.put(Character.toString(i), dict.size()+1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<msg.length(); i++){
            sb.setLength(0);
            sb.append(msg.charAt(i));
            
            
            while (i + 1 < msg.length() &&
                   dict.putIfAbsent(sb.toString() + msg.charAt(i + 1), dict.size() + 1) != null) {
                sb.append(msg.charAt(++i));
            }
            answer.add(dict.get(sb.toString()));
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}