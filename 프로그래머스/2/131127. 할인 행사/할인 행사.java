import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i<want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        
        for(int i=0; i<discount.length -9; i++){
            HashMap<String,Integer> dis10m = new HashMap<>();
            
            for(int j=i; j< i+ 10; j++ ){
                if(wantMap.containsKey(discount[j]))
                dis10m.put(discount[j], dis10m.getOrDefault(discount[j],0) + 1);
            }
            if(wantMap.equals(dis10m)) answer++;
        }
        
        
        return answer;
    }
}