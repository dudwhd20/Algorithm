import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = new int[]{1,2,3,4,5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a = cal(one,answers);
        int b = cal(two,answers);
        int c = cal(three,answers);

        int max = Arrays.stream(new int[]{a,b,c}).max().getAsInt();

        List<Integer> r = new ArrayList<>();

        if(a == max){
            r.add(1);
        }

        if(b == max){
           r.add(2);
        }

        if(c == max){
            r.add(3);
        }
        
        return r.stream().filter(e->e>0).mapToInt(Integer::intValue).toArray();
    }
    
    public int cal(int[] t, int[] num){
        int c = 0;
        int r = 0;
        for(int i=0; i<num.length; i++){
            if(c >= t.length) c = 0;
            if(num[i] == t[c]) r ++;
            c++;
        }

        return r;
    }
}