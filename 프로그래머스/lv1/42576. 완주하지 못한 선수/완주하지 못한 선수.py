
def solution(participant, completion):
    l=sum([hash(_) for _ in participant])-sum([hash(_) for _ in completion])
    for a in participant:
        if hash(a)==l:
            return a