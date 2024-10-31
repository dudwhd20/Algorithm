class Solution {
    public int solution(int n, int t) {
        int r = n;
        for(int i = 0; i<t; i++){
            r *= 2;
        }
        return r;
    }
}