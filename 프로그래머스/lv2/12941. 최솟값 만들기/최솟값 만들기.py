def solution(A,B):
    A.sort(reverse=True)
    B.sort()
    r = 0
    for _ in range(len(A)):
        r += A.pop() * B.pop() 
    return r
