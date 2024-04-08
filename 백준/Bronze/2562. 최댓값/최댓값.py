arr = []
for _ in range(9):
    arr.append(int(input()))

max_value = max(arr)
index = arr.index(max_value)
print(max_value)
print(index + 1)