import java.util.*;

class Solution {
    public int solution(int[] cookie) {
        int answer = 0;
        int n = cookie.length;

        for (int m = 0; m < n - 1; m++) {
            int l = m;
            int r = m + 1;
            int leftSum = cookie[l];
            int rightSum = cookie[r];

            while (l >= 0 && r < n) {
                if (leftSum == rightSum) {
                    answer = Math.max(answer, leftSum);
                }

                if (leftSum <= rightSum && l > 0) {
                    l--;
                    leftSum += cookie[l];
                } else if (rightSum < leftSum && r < n - 1) {
                    r++;
                    rightSum += cookie[r];
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}