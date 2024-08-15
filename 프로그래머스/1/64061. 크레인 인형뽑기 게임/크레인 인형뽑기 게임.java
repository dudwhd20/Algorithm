import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>[] l = new Stack[board.length];
        
        for(int i=0; i<l.length; i++){
            l[i] = new Stack<>();
        }
        
        for(int i = board.length - 1; i>=0; i--){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] > 0){
                    l[j].push(board[i][j]);
                }
            }
        }
        
        Stack<Integer> b = new Stack<>();
        
        for(int i : moves){
            if(l[i - 1].isEmpty()) continue;
            int m = l[i - 1].pop();
            if(!b.isEmpty() && b.peek() == m){
                b.pop();
                answer += 2;
            }else{
                b.push(m);
            }
            
        }
        
        return answer;
    }
}