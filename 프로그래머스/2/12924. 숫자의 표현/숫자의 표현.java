class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numList = new int[n];
        
        for(int i = 0; i<n; i++){
            numList[i] = i+1;
        }
        
        int left = 0;
        int right = 1;
        int sum = numList[0];
        while(left < n){
            if(sum == n){
                sum -= numList[left++];
                answer++;
            }else if(sum > n){
                sum  -= numList[left++];
            }else if(sum < n){
                sum  += numList[right++];
            }
        }
        
        return answer;
    }
}