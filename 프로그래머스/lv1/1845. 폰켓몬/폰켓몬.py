def solution(nums):
    s = set(nums)
    l = len(nums) // 2

    if(len(s) > l):
        answer = l
    else:
        answer = len(s)

    return answer