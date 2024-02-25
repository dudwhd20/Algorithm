from collections import deque

d = deque()
for _ in range(int(input())):
    i = int(input())
    if i == 0:
        d.pop()
    else:
        d.append(i)
print(sum(d))