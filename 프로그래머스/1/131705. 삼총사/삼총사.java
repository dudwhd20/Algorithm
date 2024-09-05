class Solution {
    int answer = 0;
    int[] number;

    public int solution(int[] temp) {
        number = temp;
        find(0, 0, 0);

        return answer;
    }

    private void find(int start, int level, int total) {
        if (level == 3){
            if (total == 0){
                answer += 1;
            }
            return;
        }

        for (int i = start; i < number.length; i++){
            find(i + 1, level + 1, total + number[i]);
        }

    }
}