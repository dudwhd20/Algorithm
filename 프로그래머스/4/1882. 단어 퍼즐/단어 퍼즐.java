import java.util.*;

public class Solution {
    public int solution(String[] strs, String t) {
        int n = t.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1); // 충분히 큰 값으로 초기화
        dp[0] = 0; // 빈 문자열을 만드는 데 필요한 단어 조각 수는 0

        for (int i = 1; i <= n; i++) {
            for (String s : strs) {
                int len = s.length();
                if (i >= len && t.substring(i - len, i).equals(s)) {
                    dp[i] = Math.min(dp[i], dp[i - len] + 1);
                }
            }
        }

        return dp[n] == n + 1 ? -1 : dp[n];
    }
}