import java.util.*;

class Solution {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;
    
    private static void combi(int idx, char[] order, String result){
        if(courseMap.containsKey(result.length())){
            var m = courseMap.get(result.length());
            m.put(result, m.getOrDefault(result, 0) + 1);
        }
        
        for(int i=idx; i<order.length; i++){
            combi(i + 1, order, result + order[i]);
        }
        
    }
    
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();
        courseMap = new HashMap<>();
        for(int c : course){
            courseMap.put(c, new HashMap<>());
        }
        
        for(String order : orders){
            char[] o = order.toCharArray();
            Arrays.sort(o);
            combi(0, o, "");
        }
        
        for(HashMap<String, Integer> count : courseMap.values()){
            count.values()
                .stream()
                .max(Comparator.comparingInt(o->o))
                .ifPresent( cnt -> count.entrySet()
                           .stream()
                           .filter(e -> cnt.equals(e.getValue()) && cnt > 1)
                           .forEach(e-> answer.add(e.getKey()))
                );
        }
        
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
}