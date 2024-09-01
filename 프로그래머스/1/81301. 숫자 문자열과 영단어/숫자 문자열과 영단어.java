
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String result = "";
        Map<String, Integer> wordNums = new HashMap<String, Integer>();
        wordNums.put("zero", 0);
        wordNums.put("one", 1);
        wordNums.put("two", 2);
        wordNums.put("three", 3);
        wordNums.put("four", 4);
        wordNums.put("five", 5);
        wordNums.put("six", 6);
        wordNums.put("seven", 7);
        wordNums.put("eight", 8);
        wordNums.put("nine", 9);
        
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8','9'};
        String same = "";
        
        for(int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < 10; j++) {
                if(s.charAt(i)==(nums[j])) {
                    result += nums[j];
                    flag = true;
                    break;
                }
            }
            if (flag == true) continue;
            
            same += s.charAt(i);
            if (wordNums.containsKey(same)) {
                result += wordNums.get(same);
                same = "";
            }
            
        }
        
        answer = Integer.valueOf(result);
        

        return answer;
    }
}