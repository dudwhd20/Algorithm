import java.util.*;
    
class Solution {
    public int[] solution(int N, int[] s) {
        int[] c = new int[N + 2];
        for(int i=0; i<s.length; i++){
            c[s[i]] += 1;
        }
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = s.length;
        
        for(int i=1; i<=N; i++){
            if(c[i] == 0){
                fails.put(i, 0.);
            }else{
                fails.put(i, c[i] / total);
                total -= c[i];
            }
        }        
        
        return fails.entrySet().stream().sorted( (o1, o2) -> Double.compare(o2.getValue(),
         o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}