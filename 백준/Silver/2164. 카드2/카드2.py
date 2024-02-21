from collections import deque
d = deque([_ + 1 for _ in range(int(input()))])
r = None

while d :
    r = d.popleft()
    if d :
        d.append(d.popleft())

print(r)