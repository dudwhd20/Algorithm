import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int h = bandage[1];
        int s = bandage[2];
        int ctime = 1;
        int seq = 0;
        
        int hp = health;
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i < attacks.length; i ++){
            m.put(attacks[i][0],attacks[i][1]);
        }
        
        while(ctime <= attacks[attacks.length - 1][0]){
            // System.out.println(hp);
            seq++;
            if(m.getOrDefault(ctime, 0) != 0){
                hp = hp - m.getOrDefault(ctime, 0);
                if(hp <= 0 ) return -1;                
                seq = 0;
                ctime++;
            }else{
                if(seq == t){
                    // if(health <= hp + s){
                        // hp = hp + s;
                    // }else{
                        // hp = health;
                    // }
                    hp = Math.min(hp + h, health);
                    hp = Math.min(hp + s, health);
                    seq = 0;
                }else{
                    // if(health <= hp + h){
                        // hp = hp + h;
                    // }else{
                        // hp = health;
                    // }
                    hp = Math.min(hp + h, health);
                }
                ctime++;
            }
        }        
        
        return hp;
    }
}