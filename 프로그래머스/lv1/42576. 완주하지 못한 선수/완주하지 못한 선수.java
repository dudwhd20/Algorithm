import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        String r = "";
        for(String name : completion) {

            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                participantMap.remove(name);
            }else{
                participantMap.put(name, value);
            }
        }

        return participantMap.keySet().iterator().next();
    }
}