def solution(numbers):
    arr = []
    for i in range(10):
        if not i in numbers:
            arr.append(i)
    answer = sum(arr)
    return answer