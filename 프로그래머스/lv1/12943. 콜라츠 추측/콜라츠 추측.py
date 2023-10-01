def Collatz(n):
    if n%2 == 0:
        return n / 2
    else :
        return n * 3 + 1
    

def solution(num):
    if num == 1:
        return 0
    answer = 1
    n = Collatz(num)
    while n != 1 and answer < 500:
        n = Collatz(n)
        answer += 1
    if answer == 500 :
        answer = -1
    return answer