def solution(participant, completion):
    pdic = {}
    for _ in participant :
        if _ in pdic:
            pdic[_] += 1
        else :
            pdic[_] = 1

    for _ in completion:
        pdic[_] += -1

    for _ in participant:
        if pdic[_] != 0 :
            return _