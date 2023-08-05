def solution(s):
    tmp = []
    for x in s:
        tmp.append(x)
        if len(tmp) > 1 and tmp[-1] == tmp[-2]:
            tmp.pop()
            tmp.pop()

    if len(tmp) == 0:
        return 1
    else:
        return 0