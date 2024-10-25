import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("\\{\\{", "").replaceAll("\\}\\}","")
            .replaceAll("\\},\\{","-");
        String[] sarr = s.split("-");
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(String st: sarr){
            List<Integer> temp = new ArrayList<>();
            for(String n : st.split(",")){
                temp.add(Integer.parseInt(n));
            }
            list.add(temp);
        }
        
        
        Collections.sort(list, Comparator.comparingInt(List::size));
        Set<Integer> set = new LinkedHashSet<>();
        
        for(List<Integer> nl : list){
            for(int n : nl){
                set.add(n);
            }
        }
        
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}