def solution(left, right):
    def s(x):
        print(x ** 0.5)
        if ((x ** 0.5).is_integer()):
            return -1
        else:
            return 1
    return sum([i * s(i) for i in range(left, right + 1)])