def solution(s):
    answer = ''
    arr = [int(i) for i in s.split(" ")]
    minVal = min(arr)
    maxVal = max(arr)
    answer = " ".join([str(minVal), str(maxVal)])    
    return answer