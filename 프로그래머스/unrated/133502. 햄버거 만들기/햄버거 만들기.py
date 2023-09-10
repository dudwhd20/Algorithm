def solution(i):
    s = []
    r = 0
    for _ in i:
        s.append(_)
        if(s[-4:] == [1,2,3,1]):
            del s[-4:]
            r += 1
    return r