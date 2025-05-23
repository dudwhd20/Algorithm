import java.util.*;

class Solution {
    
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)) return 0;
        Queue<Word> que = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        que.offer(new Word(begin, 0));
        visited.add(begin);
        
        while(!que.isEmpty()){
            Word curr = que.poll();
            
            if(curr.word.equals(target)) return curr.count;
            
            for(String next : words){
                if(!visited.contains(next) && isOneDiff(curr.word, next)){
                    que.offer(new Word(next, curr.count + 1));
                    visited.add(next);
                }
            }
            
        }
        
        return 0;        
        
    }
    
    
    
    public boolean isOneDiff(String a , String b){
        int diff = 0;
        for(int i=0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
            if(diff > 1) return false;
        }
        return diff == 1;
    }
    
    
    static class Word{
        String word;
        int count;
        
        public Word(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
}