from collections import deque

n, m = map(int, input().split())
graph = [list(map(int, input())) for _ in range(n)]

def bfs():
    visited = [[False] * m for _ in range(n)]
    q = deque()
    q.append((0, 0, 1))
    visited[0][0] = True

    while q:
        i, j, cnt = q.popleft()
        if i == n-1 and j == m-1:
            return cnt

        for di, dj in [[0, 1], [-1, 0], [1, 0], [0, -1]]:
            ni, nj = i + di, j + dj
            if 0 <= ni < n and 0 <= nj < m:
                if not visited[ni][nj] and graph[ni][nj] == 1:
                    visited[ni][nj] = True
                    q.append((ni, nj, cnt + 1))
    return -1

print(bfs())
