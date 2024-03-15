def solution(arr1, arr2):
    answer = []
    for i, v in enumerate(arr1):
        a = []
        for ii, vv in enumerate(v):
            a.append(arr1[i][ii] + arr2[i][ii])
        answer.append(a)
        
    return answer