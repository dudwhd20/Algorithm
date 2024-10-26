import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        var set = new LinkedHashSet<String>();
        set.add(words[0]);
        
        for(int i=1; i<words.length; i++){
            String word = words[i];
            if(!set.add(word)){
                return new int[]{i%n+1, i/n+1};
            }
            
            String prevWord = words[i-1];
            
            if(prevWord.charAt(prevWord.length() - 1) != word.charAt(0)){
                return new int[]{i%n+1, i/n+1};
            }
        }
        
        
        return new int[]{0,0};
    }
}