# 프로그래머스 | 가운데 글자 가져오기
def solution(s):
   
    #글자수가 짝수인 경우
    if len(s) % 2 == 0:
       
        #인덱스의 반을 구한 후
        #(반틈 - 1 ~ 반틈)까지 문자열 출력하기
        num = len(s) // 2
        return s[num-1:num+1]
   
    #글자수가 홀수인 경우
    #인덱스의 반을 구해서 출력
    num = len(s) // 2
    return s[num]