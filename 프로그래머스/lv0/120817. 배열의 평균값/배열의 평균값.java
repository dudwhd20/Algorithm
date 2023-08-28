import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).boxed().reduce(0, Integer::sum).doubleValue() / numbers.length;
    }
}