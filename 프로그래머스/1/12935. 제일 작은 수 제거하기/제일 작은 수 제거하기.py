def solution(arr):
   
    if len(arr)==1:
    #arr의 길이가 1 일시 return [-1] 후 종료
        return [-1]
   
    arr.remove(min(arr))
    #arr배열 중 가장 작은 수를 제거

    return arr