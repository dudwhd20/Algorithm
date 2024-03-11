def solution(people, limit):
    answer = 0
    p = sorted(people, reverse=True)
    # print(p)
    l ,r  = 0, len(people) - 1
    while l <= r:
        if p[l] + p[r] > limit:
            l = l + 1
        else:
            l = l + 1
            r = r - 1
        answer += 1
        
    # if l == r : 
        # answer += 1
        
    return answer