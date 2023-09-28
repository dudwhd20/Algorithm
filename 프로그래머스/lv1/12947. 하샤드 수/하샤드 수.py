def solution(x):
    h = 0
    for i in str(x):
        h += int(i)
    
    if x % h == 0:
        return True
    else : 
        return False
