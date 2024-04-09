s = input()
alpha = [chr(_) for _ in range(ord('a') , ord('z') +1)]

for _ in alpha:
    if _ in s:
        print(s.index(_), end=" ")
    else:
        print('-1', end=" ")