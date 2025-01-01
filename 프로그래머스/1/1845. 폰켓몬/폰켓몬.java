import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        
        return Math.min((nums.length / 2), s.size());
    }
}