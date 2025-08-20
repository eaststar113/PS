def dfs(graph, visited, start):
    visited[start] = True
    for i in graph[start]:
        if not visited[i]:
            dfs(graph, visited, i)


computer = int(input())
e = int(input())
graph = [[] for _ in range(computer + 1)]
visited = [False] * (computer + 1)
for i in range(e):
    v, r = map(int, input().split())
    graph[v].append(r)
    graph[r].append(v)
dfs(graph, visited, 1)
print(sum(visited)-1)
