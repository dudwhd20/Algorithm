class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0, end = 0, sum = sequence[0];
        int[] answer = new int[2];
        int minLength = Integer.MAX_VALUE;
        
        while(end < sequence.length){
            if(sum == k){
                if( (end - start) < minLength ){
                    minLength = end - start;
                    answer[0] = start;
                    answer[1] = end;                        
                }
                sum -= sequence[start++];
            }else if(sum < k){
                end++;
                if(end < sequence.length){
                    sum += sequence[end];    
                }
            }else{
                sum -= sequence[start++];
            }
        }
        return answer;
    }
}