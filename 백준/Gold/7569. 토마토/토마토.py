

from collections import deque

m,n,h = map(int, input().split())
tomato = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]
visited = [[[False]*m for _ in range(n)] for _ in range(h)]

dx = [1, -1, 0, 0, 0, 0]
dy = [0, 0, 1, -1, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

queue = deque()

for i in range(h):
    for j in range(n):
        for k in range(m):
            if tomato[i][j][k] == 1:
                queue.append((i, j, k))
                visited[i][j][k] = True

while queue:
    z,y,x = queue.popleft()
    for i in range(6):
        nz, ny, nx = z + dz[i], y + dy[i], x + dx[i]
        if 0 <= nx < m and 0 <= ny < n and 0 <= nz < h:
            if not visited[nz][ny][nx] and tomato[nz][ny][nx] == 0:
                visited[nz][ny][nx] = True
                tomato[nz][ny][nx] = tomato[z][y][x] + 1
                queue.append((nz, ny, nx))

ans = 0
for z in range(h):
    for y in range(n):
        for x in range(m):
            if tomato[z][y][x] == 0:
                print(-1)
                exit(0)
            ans = max(ans, tomato[z][y][x])

print(ans - 1)
