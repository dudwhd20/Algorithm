class Solution {
    static String[] vowels = {"A", "E", "I", "O", "U"};
    static int index = 0;
    static int answer = 0;

    public int solution(String word) {
        dfs("", word);
        return answer;
    }

    private void dfs(String current, String target) {
        if (current.equals(target)) {
            answer = index;
            return;
        }

        if (current.length() >= 5) return;

        for (String ch : vowels) {
            index++; 
            dfs(current + ch, target);
            if (answer != 0) return; 
        }
    }
}