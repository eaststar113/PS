from collections import deque

def bfs(arr):
    visited = [False] * len(arr)
    queue = deque()
    
    queue.append(0)
    visited[0] = True
    
    while queue:
        cur = queue.popleft()
        x, y = arr[cur]
        
        for i in range(len(arr)):
            if not visited[i]:
                nx, ny = arr[i]
                if abs(nx - x) + abs(ny - y) <= 1000:
                    visited[i] = True
                    queue.append(i)
    
    return visited[-1]

t = int(input())
for i in range(t):
    n = int(input())
    arr = []
    for j in range(n+2):
        x, y = map(int, input().split())
        arr.append((x, y))
    
    if bfs(arr):
        print("happy")
    else:
        print("sad")
