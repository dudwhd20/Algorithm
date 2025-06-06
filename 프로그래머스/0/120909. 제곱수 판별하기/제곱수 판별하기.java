class Solution {
    public int solution(int n) {
        int answer = 0;
        double que = Math.sqrt(n);
        if(que%1==0){
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}