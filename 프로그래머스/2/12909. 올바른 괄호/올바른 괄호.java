import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
            
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == '(' && c == ')'){
                stack.pop();
            }else{
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }
}