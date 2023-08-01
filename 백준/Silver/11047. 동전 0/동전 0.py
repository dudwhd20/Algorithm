N, K = map(int, input().split())
A = []

for _ in range(N):
    A.append(int(input()))

coin = 0
for _ in range(N-1, -1, -1):
    if A[_] <= K:
        coin += K // A[_]
        K = K % A[_]

print(coin)
        