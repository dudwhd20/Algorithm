import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i ++){
            map.put(nums[i], 1);
        }
        
        return Math.min(map.size(), nums.length / 2);
        
    }
}