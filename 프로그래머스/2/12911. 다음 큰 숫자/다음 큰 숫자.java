class Solution {
    public int solution(int n) {
        int answer = 0;
        int currC = cc(Integer.toBinaryString(n));
        
        while(true){
            n++;
            if(currC == cc(Integer.toBinaryString(n))) break;
        }
        
        return n;
    }
    
    public int cc(String s){
        int c = 0;
        for(char cc : s.toCharArray()){
            if(cc=='1') c++;
        }
        return c;
    }
}