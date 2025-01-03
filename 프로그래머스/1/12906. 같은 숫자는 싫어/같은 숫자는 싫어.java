import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        for(int item : arr){
            if(st.size() == 0 || st.peek() != item){
                st.add(item);
            }
        }
        
        return st;
    }
}