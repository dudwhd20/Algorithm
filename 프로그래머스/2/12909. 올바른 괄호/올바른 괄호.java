import java.util.*;

class Solution {
    boolean solution(String s) {
        LinkedList<Character> l = new LinkedList<>();
        for(char x : s.toCharArray()){
            if(x == '('){
                l.add(x);
            }else{
                if(l.isEmpty())return false;
                l.pollLast();
                
            }
        }
        return l.isEmpty();
    }
}