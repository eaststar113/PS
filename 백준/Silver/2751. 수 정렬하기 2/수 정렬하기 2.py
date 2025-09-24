import sys
input = sys.stdin.readline

N = int(input())
li = [0] * N

for j in range(N):
    li[j] = int(input())

li.sort()

for i in range(N):
    print(li[i])