import sys
input = sys.stdin.readline

N = int(input())
stack = []

for i in range(N):
    stack.append(int(input()))
max = stack.pop()
s = [max]

for w in range(len(stack)):
    a = stack.pop()
    if a > max:
        s.append(a)
        max = a

print(len(s))