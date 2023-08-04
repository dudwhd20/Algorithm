def solution(n):
    numbers = 0
    for i in range(1,n+1):    
        if i % 2 == 0:
            numbers = numbers + i
            print(numbers)
    return numbers