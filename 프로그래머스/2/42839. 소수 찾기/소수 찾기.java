import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        
        dfs("", numbers);
        int count = 0;
        for (int num : set) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    
    public void dfs(String current, String remaining){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i=0; i<remaining.length(); i++){
            dfs(
                current + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1)
            );
        }
    }
    
    public boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}