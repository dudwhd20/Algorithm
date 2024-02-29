t = ""
for _ in input():
    if _.islower():
        t += _.upper()
    else:
        t += _.lower()
print(t)
