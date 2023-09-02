import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
       String s = Arrays.stream(numbers).boxed().map(Object::toString)
                .sorted((o1,o2)->(o2 + o1).compareTo(o1 + o2)).collect(Collectors.joining(""));
        if(s.startsWith("0")){
            return "0";
        }else{
            return s;
        }
    }
}