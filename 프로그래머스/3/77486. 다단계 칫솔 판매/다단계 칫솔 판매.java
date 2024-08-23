import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String,String> p = new HashMap<>();
        for(int i=0; i<enroll.length; i++){
            p.put(enroll[i], referral[i] );
        }
        HashMap<String, Integer> totalMap = new HashMap<>();
        for(int i=0; i<seller.length; i++){
            String curr = seller[i];
            int money = amount[i] * 100;
            
            while(money > 0 && !curr.equals("-")){
                totalMap.put(curr, totalMap.getOrDefault(curr, 0) + money - (money / 10));
                curr = p.get(curr);
                money = money / 10;
            }
            
        }
        
        for(int i=0; i<enroll.length; i++){
            answer[i] = totalMap.getOrDefault(enroll[i], 0);
        }
        
        
        return answer;
    }
}