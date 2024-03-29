def solution(clothes):
    cloth_dict = {}

    for i in clothes:
        k = i[1]
        if k in cloth_dict:
            cloth_dict[k] += 1
        else:
            cloth_dict[k] = 1

    answer = 1
    for i in cloth_dict.values():
        answer *= i + 1
    
    return answer - 1