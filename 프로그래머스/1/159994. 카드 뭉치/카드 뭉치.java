import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> c1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> c2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> g = new ArrayDeque<>(Arrays.asList(goal));
        
        while(!g.isEmpty()){
            if(!c1.isEmpty() && c1.peekFirst().equals(g.peekFirst())){
                c1.pollFirst();
                g.pollFirst();
            }else if(!c2.isEmpty() && c2.peekFirst().equals(g.peekFirst())){
                c2.pollFirst();
                g.pollFirst();
            }else{
                break;
            }
        }
        return g.isEmpty() ? "Yes" : "No";
        
    }
}