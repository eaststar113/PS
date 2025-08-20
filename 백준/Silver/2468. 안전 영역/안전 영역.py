import sys
sys.setrecursionlimit(100000)

def dfs(i, j, visited, arr, height):
    for di, dj in [[0, 1], [-1, 0], [1, 0], [0, -1]]:
        ni, nj = i + di, j + dj
        if 0 <= ni < n and 0 <= nj < n:
            if arr[ni][nj] > height and visited[ni][nj] == False:
                visited[ni][nj] = True
                dfs(ni, nj, visited, arr, height)


n = int(input())
arr = []
for i in range(n):
    arr.append(list(map(int, input().split())))

min_val = 100
max_val = -1
for i in range(n):
    min_val = min(min_val, min(arr[i]))
    max_val = max(max_val, max(arr[i]))

ans = 0
for height in range(min_val - 1, max_val + 1):
    visited = [[False] * n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j] > height and visited[i][j] == False:
                dfs(i, j, visited, arr, height)
                cnt += 1
    ans = max(ans, cnt)
print(ans)
