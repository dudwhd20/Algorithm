import java.util.*;

class Solution {
    private Set<Set<Integer>> totalSet;
    
    public int solution(String[] user_id, String[] banned_id) {
        List<List<Integer>> sus = new ArrayList<>();
        
        for(String b : banned_id){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i < user_id.length; i++){
                if(canBanned(user_id[i], b)) list.add(i);
            }
            sus.add(list);
        }
        totalSet = new HashSet<>();
        findCase(sus, new HashSet<>());
        return totalSet.size();
    }
    
    
    private boolean canBanned(String userId, String banId){
        if(userId.length() != banId.length()) return false;
        
        for(int i=0; i<banId.length(); i++){
            if(banId.charAt(i) != '*' && banId.charAt(i) != userId.charAt(i)) return false;
        }
        
        return true;
    }
    
    private void findCase(List<List<Integer>> sus, Set<Integer> baned){
        
        if(sus.isEmpty()){
            totalSet.add(new HashSet<>(baned));
            return;
        }
        
        List<Integer> first = sus.get(0);
        List<List<Integer>> rest = sus.subList(1, sus.size());
        for(int i : first){
            if(!baned.contains(i)){
                Set<Integer> newBanned = new HashSet<>(baned);
                newBanned.add(i);
                findCase(rest, newBanned);
            }
        }
        
    }
    
}