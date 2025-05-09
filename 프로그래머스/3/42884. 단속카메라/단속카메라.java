import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));
        int camera = Integer.MIN_VALUE;
        int count = 0;
        
        for(int[] route : routes){
            if(route[0] > camera){
                camera = route[1];
                count++;
            }            
        }
        return count;
    }
}