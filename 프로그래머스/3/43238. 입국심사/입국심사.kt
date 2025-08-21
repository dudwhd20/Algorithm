import java.util.*;

class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var left : Long = 1
        var right : Long = times.maxOrNull()?.let { it * n.toLong() } ?: throw IllegalArgumentException()
        var answer = right

        while(left <= right) {
            var mid = left + (right - left) / 2

            var people : Long = 0

            for (t in times) {
                people += mid / t  
            }

            if(people >= n){
                answer = mid
                right = mid - 1
            }else{
                left = mid + 1
            }
        }

        return answer
    }
}