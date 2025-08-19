def dfs(r,c,d,arr,cnt):
    if arr[r][c] == 0:
        arr[r][c] = 3
        cnt += 1
    for _ in range(4):
        nd = (d+3)%4
        nr,nc = r+direction[nd][0], c+direction[nd][1]
        if 0 <= nr < n and 0 <= nc < m and arr[nr][nc] == 0:
            return dfs(nr, nc, nd, arr, cnt) 
        d = nd
    back = (d + 2) % 4
    br, bc = r + direction[back][0], c + direction[back][1]
    if 0 <= br < n and 0 <= bc < m and arr[br][bc] != 1:
        return dfs(br, bc, d, arr, cnt)
    else:
        return cnt


direction = [[-1,0],[0,1],[1,0],[0,-1]]
n,m = map(int, input().split())
r,c,d = map(int, input().split())
arr = []
cnt = 0
for i in range(n):
    arr.append(list(map(int, input().split())))
cnt = dfs(r,c,d,arr,cnt)
print(cnt)