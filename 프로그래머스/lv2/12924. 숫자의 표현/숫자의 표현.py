def solution(n):
    count = 1
    for j in range(1,n):
        m1 = j
        while True:
            if j == n:
                count += 1
                break
            elif j > n:
                break
            m1 += 1
            j += m1
        
    return count