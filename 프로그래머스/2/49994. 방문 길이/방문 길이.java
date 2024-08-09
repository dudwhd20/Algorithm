import java.util.*;

class Solution {
    public int solution(String dirs) {
        initLoc();
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>();
        
        for(int i=0; i<dirs.length(); i++){
            int[] offset = loc.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if(!isValidMove(nx,ny)) continue;
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            x = nx;
            y = ny;
        }
        
        return answer.size() / 2;
    }
    
    private static boolean isValidMove(int nx, int ny){
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
    
    private static final HashMap<Character, int[]> loc = new HashMap<>();
    
    private static void initLoc(){
        loc.put('U', new int[]{0, 1});
        loc.put('D', new int[]{0, -1});
        loc.put('L', new int[]{-1, 0});
        loc.put('R', new int[]{1, 0});
    }
    
    
    
}