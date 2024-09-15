class Solution {
    public int solution(String skill, String[] skillTrees) {
        int result = 0;  // 올바른 스킬 트리 개수를 저장
        
        for (String skillTree : skillTrees) {
            int requiredSkillIndex = 0;  // 다음으로 필요한 스킬의 인덱스
            boolean isValid = true;  // 스킬 트리가 유효한지 여부
            
            for (int i = 0; i < skillTree.length(); i++) {
                char currentSkill = skillTree.charAt(i);
                int skillIndex = skill.indexOf(currentSkill);
                
                // 현재 스킬이 필수 스킬에 포함되지 않는다면 무시
                if (skillIndex == -1) continue;
                
                // 필수 스킬이 올바른 순서대로 배치되었는지 확인
                if (skillIndex == requiredSkillIndex) {
                    requiredSkillIndex++;
                } else {
                    isValid = false;
                    break;
                }
            }
            
            // 유효한 스킬 트리인 경우 카운트 증가
            if (isValid) result++;
        }
        return result;
    }
}