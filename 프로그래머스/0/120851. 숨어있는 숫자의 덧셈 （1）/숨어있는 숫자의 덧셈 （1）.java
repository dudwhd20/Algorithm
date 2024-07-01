class Solution {
    public int solution(String s) {
        int answer = 0;
        for(String str : s.replaceAll("[a-zA-Z]","").split("")){
            answer += Integer.parseInt(str);            
        }
        return answer;
    }
}