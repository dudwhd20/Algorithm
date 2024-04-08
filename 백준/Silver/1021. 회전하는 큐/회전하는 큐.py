from collections import deque

n, m = map(int, input().split())
arr = [_ for _ in range(1, n +1)]
q = deque(arr)

l = list(map(int, input().split()))
count = 0
for _ in l:
    while True:
        if q[0] == _:
            q.popleft()
            break
        else:
            if q.index(_) < len(q) / 2 :
                while q[0] != _:
                    q.append(q.popleft())
                    count += 1
            else:
                while q[0] != _:
                    q.appendleft(q.pop())
                    count += 1
print(count)

        