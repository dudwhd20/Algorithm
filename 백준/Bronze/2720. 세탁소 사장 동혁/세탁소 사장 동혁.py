n = int(input())

item = [25, 10, 5, 1]

arr = []
for _ in range(n):
    arr.append(int(input()))


for _ in arr:
    for i in item:
        print(_//i, end=' ')
        _ = _%i
    print()

