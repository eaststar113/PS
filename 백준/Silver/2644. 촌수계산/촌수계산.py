from collections import deque

def bfs(graph, s, distance):
    visited = [False] * (n + 1)
    queue = deque()
    queue.append(s)
    visited[s] = True
    distance[s] = 0

    while queue:
        a = queue.popleft()
        # print(f"a: {a}")
        if a == end_2:
            return distance[a]
        for i in graph[a]:
            # print(f"i : {i}, graph[a]: {graph[a]}")
            if not visited[i]:
                queue.append(i)
                visited[a] = True
                distance[i] = distance[a] + 1


n = int(input())
end_1, end_2 = map(int, input().split())
m = int(input())
graph = [[] for _ in range(n + 1)]
distance = [0] * (n + 1)
cnt = 0
ans = 0
for i in range(m):
    r, v = map(int, input().split())
    graph[r].append(v)
    graph[v].append(r)
ans = bfs(graph, end_1, distance)
if ans == None:
    print(-1)
else:
    print(ans)
