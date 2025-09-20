def find(visited, temp):
    global ans

    if temp > ans:
        return

    for i in range(n):
        if visited[i]:
            continue
        visited[i] = True
        find(visited, temp + graph[sum(visited) - 1][i])
        visited[i] = False
    if sum(visited) == n:
        ans = min(ans, temp)



T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    graph = [list(map(int, input().split())) for _ in range(n)]
    visited = [False] * n
    ans = float('1e9')
    find(visited, 0)
    print(f"#{test_case} {ans}")