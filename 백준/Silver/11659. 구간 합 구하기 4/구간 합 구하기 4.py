import sys
n, m = map(int,sys.stdin.readline().split())
num = list(map(int,sys.stdin.readline().split()))
section_sum = []  ## 합 배열 선언

## 합 배열 만들기
for i in range(len(num)):
  if i == 0:
    section_sum.append(num[i])  ## num의 첫번째 숫자를 넣어준다
  else:
    section_sum.append(section_sum[-1]+num[i])  ## 합 배열의 마지막 항에 num을 더한 수를 넣어준다

## 합 배열의 차를 이용하여 구간 합 구하기
for _ in range(m):
  start, end = map(int, sys.stdin.readline().split())
  if start == 1:
    print(section_sum[end-1])
  else:
    print(section_sum[end-1] - section_sum[start-2])