import sys
for _ in range(int(input())):
    str = sys.stdin.readline().strip()
    print(str[:1] + str[-1:])